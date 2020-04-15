package com.dobby.service;

public class HelloServiceImpl implements HelloService {


    @Override
    public String sayHello(String name) {
        System.out.println("HelloServiceImpl : provider:" + name);
        return "Hello Dubbo, My name is " + name;
    }
}
