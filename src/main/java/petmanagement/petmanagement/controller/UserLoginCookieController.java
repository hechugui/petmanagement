/*
 * Copyright(c) 2019  All Rights Reserved
 * Author: Chuchu He ,also Ye Chen
 *
 */

package petmanagement.petmanagement.controller;

import org.springframework.web.bind.annotation.RestController;

/**
 * 描述:
 * 带cookie的登录
 *
 * @author Chuchu He ,also Ye Chen
 * @create 2019-03-06 下午10:40
 */
@RestController
//@RestController注解，
// 相当于@Controller+@ResponseBody两个注解的结合，
// 返回json数据不需要在方法前面加@ResponseBody注解了，
// 但使用@RestController这个注解，
// 就不能返回jsp,html页面，视图解析器无法解析jsp,html页面
// 这个也无所谓啊，本来也没想他返回页面
public class UserLoginCookieController {


}