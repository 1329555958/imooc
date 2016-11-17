package com.imooc.springboot.rpc.server.userservice;

import com.googlecode.jsonrpc4j.JsonRpcService;
import com.googlecode.jsonrpc4j.spring.AutoJsonRpcServiceImpl;
import com.imooc.springboot.rpc.bean.User;
import com.imooc.springboot.rpc.inf.UserService;
import com.imooc.springboot.rpc.server.annotations.MyRpcService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author weichunhe
 *         Created on 2016/11/17.
 * @version 1.0
 */
//@Component
@MyRpcService
public class UserServiceImpl implements UserService {
    static Map<String, User> users = new HashMap<>();

    /**
     * 初始化数据
     */
    static {
        User user = new User();
        user.setName("imooc");
        user.setPassword("imoocpw");

        users.put(user.getName(), user);
    }

    /**
     * 根据用户名和密码登录系统
     *
     * @param name     用户名
     * @param password 密码
     * @return "SUCCESS" or 错误信息
     */
    @Override
    public String login(String name, String password) {
        Assert.notNull(name, "用户名不可为空!");
        Assert.notNull(password, "密码不可为空!");

        User user = Objects.requireNonNull(users.get(name), () -> {
            return "不存在对应的用户,name=" + name;
        });

        Assert.isTrue(user.getPassword().equals(password), "密码不正确,password=" + password);


        return UserService.LOGIN_SUCCESS;
    }

    public static void main(String[] args) {
        System.out.println(UserServiceImpl.class.getAnnotation(AutoJsonRpcServiceImpl.class));
        System.out.println(UserServiceImpl.class.isAnnotationPresent(JsonRpcService.class));
        for (Annotation annotation : UserServiceImpl.class.getAnnotations()) {
            System.out.println(annotation.annotationType());
        }
    }

}
