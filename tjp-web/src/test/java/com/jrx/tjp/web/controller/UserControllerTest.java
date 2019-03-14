package com.jrx.tjp.web.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jrx.tjp.web.dto.UserDto;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

/**
 * Created by zwg on 2018/3/1.
 */
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
@AutoConfigureMockMvc
public class UserControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void updatePwd() throws Exception {

        MvcResult res = mvc.perform(MockMvcRequestBuilders.post("/user/updatePwd")
                    .param("oldPwd","123").param("newPwd","abc")
                ).andReturn();

        int status = res.getResponse().getStatus();
        Assert.assertEquals(status,200);
        String resStr = res.getResponse().getContentAsString();
        Assert.assertEquals(resStr,"ok");

    }



    @Test
    public void save() throws Exception {

        /*
        //request parameter 传递参数
        MvcResult res = mvc.perform(MockMvcRequestBuilders.post("/user/save")
                .param("name","111")
                .param("phone","13681037798")
                .param("email","aaa@126.com")
                .param("pwd","pwd")
                //.param("age","1")
        ).andReturn();
*/


        UserDto user = new UserDto();
        user.setName("name");
        user.setPhone("13681037798");
        user.setPwd("pwd");
        user.setAge(19);
        ObjectMapper objectMapper = new ObjectMapper();
        String params = objectMapper.writeValueAsString(user);
        //RequestBody 传递参数
        MvcResult res = mvc.perform(MockMvcRequestBuilders.post("/user/save")
                //指定内容类型
                .contentType(MediaType.APPLICATION_JSON)
                .content(params)
        ).andReturn();


        int status = res.getResponse().getStatus();
        Assert.assertEquals(status,200);
        String resStr = res.getResponse().getContentAsString();
        Assert.assertEquals(resStr,"ok");

    }

}