package com.imooc.spingboot.rpc.client.controller;

import com.imooc.spingboot.rpc.inf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wid on 2016/11/19.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 用户登录
     *
     * @param name     用户名
     * @param password 密码
     * @return 登录结果信息
     */
    @RequestMapping("/login")
    public String login(String name, String password) {
        //TODO 条件判断，检查参数是否合法
        return userService.login(name, password);
    }
}
