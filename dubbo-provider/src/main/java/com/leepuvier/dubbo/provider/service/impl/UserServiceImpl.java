package com.leepuvier.dubbo.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.leepuvier.dubbo.common.domin.People;
import com.leepuvier.dubbo.common.service.UserService;
import com.leepuvier.dubbo.provider.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @Author : wecashtester
 * @CreateTime : 2019/9/23  8:53 PM
 * @ContentUse ：
 */

public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public People findUser() {
        return userMapper.getOne(1);
    }

}
