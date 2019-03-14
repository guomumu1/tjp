package com.jrx.tjp.web.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.*;
import java.io.Serializable;

/**
 * 用户数据传输层对象
 *
 * <br> 属性验证 参见：javax.validation.constraints
 * <br> 接口注释说明参见io.swagger.annotations
 *
 * @author  zwg
 * @date 2018/3/2.
 */
@ApiModel(value = "用户数据对象", description = "用户数据对象")
public class UserDto implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * 姓名
     */
    @ApiModelProperty(required = true, value = "姓名",dataType = "String")
    @NotNull(message = "姓名不能为空")
    @Size(min = 3,max = 10,message = "姓名长度范围[3-10]")
    private String name;

    /**
     * 手机号
     */
    @ApiModelProperty(required = true,value = "手机号",dataType = "String")
    @NotNull(message = "手机号不能为空")
    @Pattern(regexp = "^((13[0-9])|(15[0-9])|(18[0-9])|(17[0-8])|(147))\\d{8}$", message = "手机号不合法")
    private String phone;

    /**
     * 邮箱
     */
    @ApiModelProperty(value = "手机号",dataType = "String")
    @Pattern(regexp = "^(([a-z0-9A-Z]+[-|_|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,})$", message = "邮箱不合法")
    private String email;

    /**
     * 头像地址
     */
    @ApiModelProperty(value = "头像地址",dataType = "String")
    private String image;

    /**
     * 密码
     */
    @ApiModelProperty(required = true,value = "密码",dataType = "String")
    @NotNull(message = "密码不能为空")
    private String pwd;

    /**
     * 年龄  类型为int 如果不输入值默认为0验证不通过，integer默认为null可以通过
     */
    @ApiModelProperty(value = "年龄",dataType = "Integer")
    @Min(value = 18, message = "年龄最小18岁")
    @Max(value = 60, message = "年龄最大60岁")
    private int age=0;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserDto{");
        sb.append("name='").append(name).append('\'');
        sb.append(", phone='").append(phone).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", image='").append(image).append('\'');
        sb.append(", pwd='").append(pwd).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}
