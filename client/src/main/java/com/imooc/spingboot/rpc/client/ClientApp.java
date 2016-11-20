package com.imooc.spingboot.rpc.client;

import com.googlecode.jsonrpc4j.spring.AutoJsonRpcClientProxyCreator;
import com.imooc.spingboot.rpc.inf.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by wid on 2016/11/19.
 */
@SpringBootApplication
public class ClientApp {

    public static void main(String[] args) {
        SpringApplication.run(ClientApp.class, args);
    }

    /**
     * 创建rpc服务客户端代理
     *
     * @return
     */
    @Bean
    public AutoJsonRpcClientProxyCreator rpcClientProxyCreator() {
        AutoJsonRpcClientProxyCreator rpcClientProxyCreator = new AutoJsonRpcClientProxyCreator();
        try {
            rpcClientProxyCreator.setBaseUrl(new URL("http://localhost:8080/"));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        rpcClientProxyCreator.setScanPackage(UserService.class.getPackage().getName());
        return rpcClientProxyCreator;
    }
}
