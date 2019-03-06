/*
 * Copyright(c) 2019  All Rights Reserved
 * Author: Chuchu He ,also Ye Chen
 *
 */

package petmanagement.petmanagement.pojo;

import javax.validation.constraints.NotNull;

/**
 * 描述:
 * 登录用的info
 *
 * @author Chuchu He ,also Ye Chen
 * @create 2019-03-05 下午10:20
 */
public class LoginInfo {

    @NotNull(message = "no null")
    private String username;

    @NotNull
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }






}