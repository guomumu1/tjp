package com.jrx.tjp.oracle.jpa.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 用户对象类
 *
 * @author zwg
 * @create 2018-03-15 9:29
 */
@Entity
//表名长度最大30个字符
@Table(name = "T_USER")
public class User implements Serializable {

    public static final Long serialVersionUID = 1L;


    /*
        drop trigger "TIB_T_USER";

        create trigger "TIB_T_USER" before insert
        on "T_USER" for each row
        declare
            integrity_error  exception;
            errno            integer;
            errmsg           char(200);
            dummy            integer;
            found            boolean;

        begin
            --  Column ""id"" uses sequence S_T_USER
              select S_T_USER.NEXTVAL INTO :NEW."ID" from dual;

        --  Errors handling
        exception
            when integrity_error then
               raise_application_error(errno, errmsg);
        end;


     */

    /** 用户ID */
    @Id
    //@GeneratedValue
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="S_T_USER")
    /**
     * allocationSize 要指定为1，否则它会按照默认50个数字增长
     * sequenceName 数据库序列名称
     * 重要: 如果数据库中创建了触发器设置自增序列ID值，那代码返回的对象的ID值和数据库中的不一致
     */
    @SequenceGenerator(name="S_T_USER",sequenceName="S_T_USER",allocationSize=1)
    private Long id;
    /** 用户名称 */
    @Column(name = "name", length = 20)
    private String name;
    /** 用户年龄 */
    @Column(name = "age")
    private Integer age;

    @Column(name = "address", length = 150)
    private String address;

    @Column(name="money", precision = 18, scale = 5)
    private BigDecimal money;

    public User() {
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
