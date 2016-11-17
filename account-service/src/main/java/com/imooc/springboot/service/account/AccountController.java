package com.imooc.springboot.service.account;

import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author weichunhe
 *         Created on 2016/11/17.
 * @version 1.0
 */
@RestController
@RequestMapping("/account")
public class AccountController {

    /**
     * 注册用
     *
     * @param name     用户名
     * @param password 密码
     * @return 注册结果
     */
    @RequestMapping("/register")
    public String register(String name, String password) {
        Assert.notNull(name, "用户名不允许为空");
        Assert.notNull(password, "密码不允许为空");
        return "success";
    }
}
