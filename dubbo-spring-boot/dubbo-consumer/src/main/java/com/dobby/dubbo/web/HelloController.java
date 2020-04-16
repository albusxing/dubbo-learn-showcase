package com.dobby.dubbo.web;

import com.dobby.service.HelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    /**
     * 引用 dubbo 服务
     */
    @Reference(version = "${hello.service.version}")
    private HelloService helloService;


    @GetMapping("/hello")
    public String hello() {
        return helloService.sayHello("lgq");
    }

}
