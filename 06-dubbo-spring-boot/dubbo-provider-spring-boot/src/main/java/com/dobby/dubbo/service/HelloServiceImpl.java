package com.dobby.dubbo.service;

import com.dobby.service.HelloService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

/**
 *
 */
@Service(version = "${hello.service.version}")
public class HelloServiceImpl implements HelloService {


    @Value("${dubbo.application.name}")
    private String serviceName;

    @Override
    public String sayHello(String name) {
        return String.format("[%s] : Hello, %s", serviceName, name);
    }
}
