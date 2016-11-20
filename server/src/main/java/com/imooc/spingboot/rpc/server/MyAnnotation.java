package com.imooc.spingboot.rpc.server;

import com.googlecode.jsonrpc4j.spring.AutoJsonRpcServiceImpl;
import org.springframework.stereotype.Component;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by wid on 2016/11/19.
 */
@AutoJsonRpcServiceImpl
@Component
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
}
