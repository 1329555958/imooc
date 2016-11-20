package com.imooc.spingboot.service.account.controller;

import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wid on 2016/11/19.
 */
@RestController
@RequestMapping("/account")
public class AccountController {
    /**
     * 注册账号
     *
     * @param name     用户名
     * @param password 密码
     * @return 注册结果信息
     */
    @RequestMapping("/register")
    public String register(String name, String password) {
        Assert.notNull(name, "name is need!");
        Assert.notNull(password, "password is need!");
        return "success";
    }
}
