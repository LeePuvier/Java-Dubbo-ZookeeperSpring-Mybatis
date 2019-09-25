package com.leepuvier.dubbo.provider.service.impl;

import com.leepuvier.dubbo.common.service.DemoService;

/**
 * @Author : wecashtester
 * @CreateTime : 2019/9/25  1:52 PM
 * @ContentUse ：
 */

public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
