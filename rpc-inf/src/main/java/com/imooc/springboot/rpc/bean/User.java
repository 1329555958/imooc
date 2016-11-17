package com.imooc.springboot.rpc.bean;

/**
 * @author weichunhe
 *         Created on 2016/11/17.
 * @version 1.0
 */
public class User {
    private String name;
    private String password;
    private String address;
    private int age;


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
