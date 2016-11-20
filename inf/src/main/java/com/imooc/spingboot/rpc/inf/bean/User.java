package com.imooc.spingboot.rpc.inf.bean;

/**
 * Created by wid on 2016/11/19.
 */
public class User {
    /**
     * 姓名，密码
     */
    private String name, password;
    /**
     * 年龄
     */
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
