package com.leepuvier.dubbo.customer;

import com.leepuvier.dubbo.common.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author : wecashtester
 * @CreateTime : 2019/9/25  2:06 PM
 * @ContentUse ：
 */
public class Consumer {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"dubbo-consumer.xml"});
        context.start();
        // Obtaining a remote service proxy
        DemoService demoService = (DemoService)context.getBean("demoService");
        // Executing remote methods
        String hello = demoService.sayHello("world");
        // Display the call result
        System.out.println("-----------------------> " + hello);
    }
}
