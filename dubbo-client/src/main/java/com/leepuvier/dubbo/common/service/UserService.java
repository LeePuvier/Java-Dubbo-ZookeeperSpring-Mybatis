package com.leepuvier.dubbo.common.service;

import com.leepuvier.dubbo.common.domin.People;

import java.util.List;

/**
 * @Author : LeePuvier
 * @CreateTime : 2019/9/23  8:38 PM
 * @ContentUse ：
 */

public interface UserService {

    /**
     * 查询所有用户信息
     * @return
     */
    List<People> findUser();

    /**
     * 依据用户ID查询用户
     * @param id
     * @return
     */
    People getUserById(Integer id);

    /**
     * 新增用户
     * @param people
     * @return
     */
    int addUser(People people);

    /**
     * 更新用户信息
     * @param people
     * @return
     */
    int updateUser(People people);

    /**
     * 删除用户信息
     * @param id
     * @return
     */
    int deleteUser(int id);
}
