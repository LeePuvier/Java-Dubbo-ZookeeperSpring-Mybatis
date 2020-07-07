package com.leepuvier.dubbo.provider.service.impl;

import com.alibaba.dubbo.common.logger.LoggerFactory;
import com.alibaba.dubbo.config.annotation.Service;
import com.leepuvier.dubbo.common.domin.People;
import com.leepuvier.dubbo.common.service.UserService;
import com.leepuvier.dubbo.provider.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/**
 * @Author : LeePuvier
 * @CreateTime : 2019/9/23  8:53 PM
 * @ContentUse ：
 */

public class UserServiceImpl implements UserService {

    private static final com.alibaba.dubbo.common.logger.Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserMapper userMapper;

    @Autowired
    RedisTemplate redisTemplate;

    @Override
    public List<People> findUser() {
        return userMapper.getAll();
    }

    /**
     * 获取user逻辑：
     *  如果缓存存在，从缓存中获取user信息
     *  如果缓存不存在，从 DB 中获取user信息，然后插入缓存
     * @param id
     * @return
     */
    @Override
    public People getUserById(int id) {
        String key = "user_" + id;
        //ToDO :Redis缓存的读取
        ValueOperations<String, People> operations = redisTemplate.opsForValue();
        boolean hasKey = redisTemplate.hasKey(key);

        //缓存存在
        if (hasKey){
            People people = operations.get(key);
            logger.info("-----------------> 缓存获取：" + people.getName().toString());
            return people;
        }

        //从数据库获取
        People people = userMapper.getUserById(id);
        //插入缓存
        operations.set(key, people, 4, TimeUnit.HOURS);
        logger.info("-----------------> 插入缓存：" + people.getName().toString());
        return people;
    }

    @Override
    public int addUser(People people) {
        return 0;
    }

    @Override
    public int updateUser(People people) {
        return 0;
    }

    @Override
    public int deleteUser(int id) {
        return 0;
    }

}
