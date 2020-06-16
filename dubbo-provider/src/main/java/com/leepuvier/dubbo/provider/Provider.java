package com.leepuvier.dubbo.provider;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author : wecashtester
 * @CreateTime : 2019/9/25  2:13 PM
 * @ContentUse ：
 */

@SpringBootApplication
public class Provider {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-provider.xml");
        context.start();
        System.in.read();
    }
}
