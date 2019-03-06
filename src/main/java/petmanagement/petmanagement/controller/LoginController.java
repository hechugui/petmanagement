/*
 * Copyright(c) 2019  All Rights Reserved
 * Author: Chuchu He ,also Ye Chen
 *
 */

package petmanagement.petmanagement.controller;

import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import petmanagement.petmanagement.pojo.LoginInfo;
import petmanagement.petmanagement.result.*;

import java.util.Objects;


/**
 * 描述:控制登录，应该和数据库连起来，共同判断
 * login
 *
 * @author Chuchu He ,also Ye Chen
 * @create 2019-03-05 下午10:32
 */

@Controller
public class LoginController {
    /**
     * 登录控制器，前后端分离用的不同协议和端口，所以需要加入@CrossOrigin支持跨域。
     * 给VueLoginInfoVo对象加入@Valid注解，并在参数中加入BindingResult来获取错误信息。
     * 在逻辑处理中我们判断BindingResult知否含有错误信息，如果有错误信息，则直接返回错误信息。
     */
    @CrossOrigin
    @RequestMapping(value = "/api/login", method = RequestMethod.POST, produces = "application/json; charset=UTF-8")
    @ResponseBody
    public Result login(@Valid @RequestBody LoginInfo loginInfo, BindingResult bindingResult) {
        //requestbody是把传回来的那个字符串构造成了个叫loginInfo 的logininfo的类

        //bindingresult??????????????
        if (bindingResult.hasErrors()) {
            String message = String.format("登陆失败，详细信息[%s]。", bindingResult.getFieldError().getDefaultMessage());
            return ResultFactory.buildFailResult(message);
        }

        if (!Objects.equals("2", loginInfo.getUsername()) || !Objects.equals("2", loginInfo.getPassword())) {
            String message = String.format("登陆失败，详细信息[用户名、密码信息不正确]。");
            return ResultFactory.buildFailResult(message);
            //这个message data 的区分很迷啊
        }

        return ResultFactory.buildSuccessResult("登陆成功。");
        //会传到前台一个result
    }
    //mapping在后台来说其实无所谓，只要和前台对应起来就好
    //按照标准的逻辑，所有controller控制的在/api/里写

}