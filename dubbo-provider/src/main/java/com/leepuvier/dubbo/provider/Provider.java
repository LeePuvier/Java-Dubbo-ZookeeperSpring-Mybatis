package com.leepuvier.dubbo.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author : wecashtester
 * @CreateTime : 2019/9/25  2:13 PM
 * @ContentUse ：
 */
public class Provider {

    public static void main(String[] args) throws Exception {
        System.setProperty("java.net.preferIPv4Stack", "true");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"dubbo-provider.xml"});
        context.start();
        System.out.println("Provider started.");
        System.in.read(); // press any key to exit
    }
}
