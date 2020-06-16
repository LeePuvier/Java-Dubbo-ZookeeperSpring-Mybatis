package com.leepuvier.dubbo.provider;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author : wecashtester
 * @CreateTime : 2019/10/16  8:43 PM
 * @ContentUse ：
 */

@EnableApolloConfig
@SpringBootApplication
public class SpringbootApolloApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootApolloApplication.class, args);
    }
}
