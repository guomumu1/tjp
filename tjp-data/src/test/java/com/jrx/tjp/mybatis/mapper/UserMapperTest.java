package com.jrx.tjp.mybatis.mapper;

import com.jrx.tjp.mybatis.entity.User;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by zwg on 2018/3/15.
 */
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class UserMapperTest {

    public static final Logger logger = LoggerFactory.getLogger(UserMapperTest.class);

    @Autowired
    UserMapper userMapper;

    @Before
    public void setUp() throws Exception {
        userMapper.dropTable();
        userMapper.createTable();
    }

    @Test
    public void saveAndGet(){
        User user = new User("zhenqi", 25);
        userMapper.insert(user);

        List<User> userList = userMapper.findByNameLike("zhenqi");
        Assert.assertNotNull(userList);

        logger.info("users:{}",userList);

        User _user = userMapper.findByName("zhenqi");
        Assert.assertNotNull(_user);

        logger.info("_user:{}",_user);

        User userXml = userMapper.selectByName("zhenqi");
        Assert.assertNotNull(userXml);

        logger.info("userXml:{}",userXml);
    }

    @After
    public void tearDown() throws Exception {

    }

}