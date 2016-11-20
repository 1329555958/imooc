package com.imooc.spingboot.rpc.server.server;

import com.googlecode.jsonrpc4j.spring.AutoJsonRpcServiceImpl;
import com.imooc.spingboot.rpc.inf.bean.User;
import com.imooc.spingboot.rpc.inf.service.UserService;
import com.imooc.spingboot.rpc.server.MyAnnotation;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Created by wid on 2016/11/19.
 */
@MyAnnotation
public class UserServiceImpl implements UserService {

    /**
     * 定义数据库及初始化
     */
    private static Map<String, User> database = new HashMap<>();

    static {
        User user = new User();
        user.setName("imooc");
        user.setPassword("pwd");
        database.put(user.getName(), user);
    }

    /**
     * 用户登录
     *
     * @param name     用户名
     * @param password 密码
     * @return success 或错误信息
     */
    @Override
    public String login(String name, String password) {
        Assert.notNull(name, "name is need!");
        Assert.notNull(password, "password is need!");
        User user = Objects.requireNonNull(database.get(name), name + " is not exists!");
        Assert.isTrue(user.getPassword().equals(password), "password is error !");
        return UserService.LOGIN_SUCCESS;
    }
}
