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

    //更新
    public void updateUser(User user){
        System.out.println("更新User的方法！");
    }

    //删除
    public void deleteUser(Integer id){
        System.out.println("B开发者添加的代码。。。。");
        System.out.println("删除User的方法啊！");
        System.out.println("B开发者添加的代码。。。。");
    }


}
