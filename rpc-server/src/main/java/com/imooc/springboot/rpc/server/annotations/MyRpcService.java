package com.imooc.springboot.rpc.server.annotations;

import com.googlecode.jsonrpc4j.spring.AutoJsonRpcServiceImpl;
import org.springframework.stereotype.Component;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author weichunhe
 *         Created on 2016/11/17.
 * @version 1.0
 */
@Component
@AutoJsonRpcServiceImpl
@Retention(RetentionPolicy.RUNTIME)
public @interface MyRpcService {
}
