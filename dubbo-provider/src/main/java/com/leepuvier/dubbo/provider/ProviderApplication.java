package com.leepuvier.dubbo.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

/**
 * @Author : wecashtester
 * @CreateTime : 2019/9/20  6:39 PM
 * @ContentUse ：
 */
@SpringBootApplication(scanBasePackages = "com.leepuvier")
@ImportResource({"classpath:dubbo-provider.xml"})
@MapperScan("com.leepuvier")
public class ProviderApplication {
    public static void main(String[] args) throws IOException {
        SpringApplication.run(ProviderApplication.class, args);
        System.out.println("服务端启动成功！！！");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
