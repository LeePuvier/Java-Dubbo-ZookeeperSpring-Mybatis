package com.leepuvier.dubbo.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @Author : wecashtester
 * @CreateTime : 2019/9/23  8:06 PM
 * @ContentUse ：
 */

@SpringBootApplication
@ImportResource({"classpath:dubbo-consumer.xml"})
public class ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
        System.out.println("消费端启动成功！！！");
    }
}
