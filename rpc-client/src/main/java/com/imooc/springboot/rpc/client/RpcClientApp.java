package com.imooc.springboot.rpc.client;

import com.googlecode.jsonrpc4j.spring.AutoJsonRpcClientProxyCreator;
import com.imooc.springboot.rpc.inf.UserService;
import com.imooc.springboot.service.account.AccountService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author weichunhe
 *         Created on 2016/11/17.
 * @version 1.0
 */
@SpringBootApplication
public class RpcClientApp {

    public static void main(String[] args) {
        SpringApplication.run(RpcClientApp.class, args);
    }

    /**
     * 创建rpc客户端
     *
     * @return rpc客户端代理
     */
    @Bean
    public AutoJsonRpcClientProxyCreator rpcClientProxyCreator() {
        AutoJsonRpcClientProxyCreator clientProxyCreator = new AutoJsonRpcClientProxyCreator();
        clientProxyCreator.setScanPackage(UserService.class.getPackage().getName());
        try {
            clientProxyCreator.setBaseUrl(new URL("http://localhost:9000"));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return clientProxyCreator;
    }
}
