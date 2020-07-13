package com.leepuvier.dubbo.common.service;

import com.leepuvier.dubbo.common.domin.People;

import java.util.List;

/**
 * @Author : LeePuvier
 * @CreateTime : 2019/9/23  8:38 PM
 * @ContentUse ：
 */

public interface UserService {
    List<People> findUser();

    People getUserById(Integer id);

    int addUser(People people);

    int updateUser(People people);

    int deleteUser(int id);
}
