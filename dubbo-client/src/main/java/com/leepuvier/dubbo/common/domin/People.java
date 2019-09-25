package com.leepuvier.dubbo.common.domin;

import java.io.Serializable;

/**
 * @Author : wecashtester
 * @CreateTime : 2019/9/23  8:37 PM
 * @ContentUse ：
 */
public class People implements Serializable {

    private static final long servialVersionUID = 1L;

    private int id;

    private  String name;

    private  int age;

    private String sex;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
