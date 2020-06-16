package com.leepuvier.dubbo.customer.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author : wecashtester
 * @CreateTime : 2019/10/16  8:53 PM
 * @ContentUse ：
 */
@RestController
public class DemoController {
//    @Value("${index.info}")
    private String info;

//    @RequestMapping("index")
    public String getIndexInfo(String name){
        return "-------->" + name + "-------->" + info;
    }
}
