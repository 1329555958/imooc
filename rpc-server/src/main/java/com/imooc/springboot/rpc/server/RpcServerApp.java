package com.imooc.springboot.rpc.server;

import com.googlecode.jsonrpc4j.spring.AutoJsonRpcServiceImplExporter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author weichunhe
 *         Created on 2016/11/17.
 * @version 1.0
 */
@SpringBootApplication
//@ComponentScan("com.imooc.springboot.rpc.inf")
public class RpcServerApp {
    public static void main(String[] args) {
        SpringApplication.run(RpcServerApp.class, args);
    }

    /**
     * 自动发现rpc的实现类，将接口中的方法以rpc方式提供出去
     *
     * @return 服务发现
     */
    @Bean
    public AutoJsonRpcServiceImplExporter rpcServiceImplExporter() {
        AutoJsonRpcServiceImplExporter exporter = new AutoJsonRpcServiceImplExporter();
        return exporter;
    }
}
