package com.jrx.tjp.web.controller;

import com.jrx.tjp.web.dto.UserDto;
import com.jrx.tjp.web.service.IUserService;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.Valid;

/**
 * 用户对外Http接口类
 * @author zwg
 * @date 2018/3/1
 */
@Controller
//value 定义访问此接口类的统一路径，下面方法中只配置具体的方面名称
@RequestMapping(value = "/user")
//接口类描述
@Api(description = "用户接口")
public class UserController {

    public static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    IUserService userService;

    /**
     * 修改密码
     * @param oldPwd   旧密码
     * @param newPwd   新密码
     * @return         根据需要返回不同结构的数据
     */
    @ApiOperation(value = "修改密码")
    @RequestMapping(value = "/updatePwd",method = RequestMethod.POST)
    @ResponseBody
    public String updatePwd(@ApiParam(name = "oldPwd",value = "旧密码", required = true) @RequestParam String oldPwd,
                            @ApiParam(name = "newPwd",value = "新密码",required = true) @RequestParam String newPwd){
        userService.updateUserPwd(1,oldPwd,newPwd);
        return "ok";
    }

    /**
     * 更新邮箱   不发布swagger api接口说明
     * @param email
     * @return
     */
    @ApiIgnore
    @RequestMapping(value = "/updateEmail",method = RequestMethod.POST)
    @ResponseBody
    public String updateEmail(String email){
        return "ok";
    }

    /**
     * 保存用户
     * @param userDto 用户信息
     * @return
     */
    @ApiOperation(value = "保存用户",httpMethod = "POST", produces = MediaType.APPLICATION_JSON_VALUE)
    @RequestMapping(value = "/save",method = RequestMethod.POST)
    @ResponseBody
    public String save(@Valid @RequestBody UserDto userDto){

        logger.info("userDto:{}",userDto);

        return "ok";
    }

    /**
     * 保存用户
     * @param userDto 用户信息
     * @return
     */
    /*@ApiOperation(value = "保存用户")
    @ApiImplicitParam(dataType = "UserDto", name="userDto",value = "用户数据对象", required = true)
    @RequestMapping(value = "/save2",method = RequestMethod.POST)
    @ResponseBody
    public String save2(@Valid @RequestBody UserDto userDto){


        return "ok";
    }*/








}
