package com.leepuvier.dubbo.customer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.leepuvier.dubbo.common.domin.People;
import com.leepuvier.dubbo.common.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author : wecashtester
 * @CreateTime : 2019/9/23  3:44 PM
 * @ContentUse ：
 */
@RestController
public class UserController {

    @Resource
    @Reference
    private UserService userService;

    @GetMapping("getUser")
    public People user(){
        System.out.println("----------------------> 消费者服务调用成功");
        System.out.println("----------------------> " + userService.hashCode());
        return userService.findUser();
    }
}
