package com.ygli3.entity;

import java.io.Serializable;

public class User implements Serializable{
    private static final long serialVersionUID = -3246698373089824455L;
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}