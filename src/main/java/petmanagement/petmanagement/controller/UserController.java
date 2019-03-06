/*
 * Copyright(c) 2019  All Rights Reserved
 * Author: Chuchu He ,also Ye Chen
 *
 */

package petmanagement.petmanagement.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import petmanagement.petmanagement.entity.*;
import petmanagement.petmanagement.service.*;

/**
 * 描述:
 *
 * @author Ye Chen
 * @create 2019-03-03 下午6:59
 */
@Controller
@RequestMapping(value="/user")
public class UserController {
    @Autowired
    private UserService userService;


}