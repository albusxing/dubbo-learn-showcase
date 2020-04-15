package com.dobby.service;

/**
 * @author liguoqing
 */
public class HelloPlusServiceImpl implements HelloService {


    @Override
    public String sayHello(String name) {
        System.out.println("HelloPlusServiceImpl provider:" + name);
        return "Hello Plus Dubbo, My name is " + name;
    }
}
