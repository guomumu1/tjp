package com.jrx.tjp.mybatis.entity;

import java.io.Serializable;

/**
 * 用户对象类
 *
 * @author zwg
 * @create 2018-03-15 9:29
 */
public class User implements Serializable {

    public static final Long serialVersionUID = 1L;

    /** 用户ID */
    private Integer id;
    /** 用户名称 */
    private String name;
    /** 用户年龄 */
    private Integer age;

    public User() {
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}
