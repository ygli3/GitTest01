package com.ygli3.dao;

import com.ygli3.entity.User;

public class UserDao {

    //增加
    public void addUser(User user){
        System.out.println("保存User实体！");
    }

    //查询
    public  User getUser(Integer id){
        return new User();
    }


}
