package com.leepuvier.dubbo.common.service;

import com.leepuvier.dubbo.common.domin.People;

/**
 * @Author : LeePuvier
 * @CreateTime : 2019/9/23  8:38 PM
 * @ContentUse ：
 */

public interface UserService {
    People findUser();

    People getUserById(int id);

    int addUser(People people);

    int updateUser(People people);

    int deleteUser(int id);
}
