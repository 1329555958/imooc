package com.imooc.springboot.rpc.client.controller;

import com.imooc.springboot.rpc.inf.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author weichunhe
 *         Created on 2016/11/17.
 * @version 1.0
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    UserService userService;

    /**
     * 用户登录
     *
     * @param name     用户名
     * @param password 密码
     * @return 登录信息
     */
    @RequestMapping("/login")
    public String login(String name, String password) {
        return userService.login(name, password);
    }

}
