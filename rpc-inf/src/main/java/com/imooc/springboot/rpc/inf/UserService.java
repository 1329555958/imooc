package com.imooc.springboot.rpc.inf;

import com.googlecode.jsonrpc4j.JsonRpcService;
import com.imooc.springboot.rpc.bean.User;

/**
 * @author weichunhe
 *         Created on 2016/11/17.
 * @version 1.0
 */
@JsonRpcService("/rpc/user")
public interface UserService {
    /**
     * 登录成功
     */
    String LOGIN_SUCCESS = "success";

    /**
     * 根据用户名和密码登录系统
     *
     * @param name     用户名
     * @param password 密码
     * @return "SUCCESS" or 错误信息
     */
    public String login(String name, String password);
}
