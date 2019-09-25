package com.leepuvier.dubbo.provider.mapper;

import com.leepuvier.dubbo.common.domin.People;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Author : wecashtester
 * @CreateTime : 2019/9/23  9:10 PM
 * @ContentUse ：
 */
@Mapper
public interface UserMapper {

    List<People> getAll();

    People getOne(Integer id);
}
