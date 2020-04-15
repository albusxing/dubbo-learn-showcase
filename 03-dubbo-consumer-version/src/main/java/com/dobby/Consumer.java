package com.dobby;

import com.dobby.service.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author liguoqing
 */
public class Consumer {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-consumer.xml");
        context.start();
        // 获取远程服务代理
        HelloService helloService = (HelloService) context.getBean("helloService");
        // 执行远程方法
        String hello = helloService.sayHello("ligq03");
        // 显示调用结果
        System.out.println(hello);

    }
}
