package com.dobby;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.io.IOException;

/**
 * @author liguoqing
 */
public class Provider {

    public static void main(String[] args) throws IOException {
        // 创建容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-provider.xml");
        // 启动容器
        context.start();
        // 让应用处于阻塞状态
        System.in.read();

    }

}
