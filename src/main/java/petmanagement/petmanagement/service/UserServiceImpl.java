/*
 * Copyright(c) 2019  All Rights Reserved
 * Author: Chuchu He ,also Ye Chen
 *
 */

package petmanagement.petmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import petmanagement.petmanagement.entity.*;
import petmanagement.petmanagement.mapper.*;
import petmanagement.petmanagement.service.UserService;
import java.util.List;
import java.util.ArrayList;
/**
 * 描述:
 * 正经写方法逻辑的
 *
 * @author Chuchu He ,also Ye Chen
 * @create 2019-03-03 下午7:52
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


}
