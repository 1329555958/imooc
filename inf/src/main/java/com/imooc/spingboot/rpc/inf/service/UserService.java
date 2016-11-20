package com.imooc.spingboot.rpc.inf.service;

import com.googlecode.jsonrpc4j.JsonRpcService;

/**
 * 用户接口
 * Created by wid on 2016/11/19.
 */
@JsonRpcService("/rpc/user")
public interface UserService {
    /**
     * 登录成功
     */
    String LOGIN_SUCCESS = "success";

    /**
     * 用户登录
     *
     * @param name     用户名
     * @param password 密码
     * @return success 或错误信息
     */
    public String login(String name, String password);
}
