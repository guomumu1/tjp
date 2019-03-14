package com.jrx.tjp.oracle.jpa.repository;

import com.jrx.tjp.oracle.StartOracleAppTest;
import com.jrx.tjp.oracle.jpa.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;

@SpringApplicationConfiguration(StartOracleAppTest.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;


    @Test
    public void saveUser(){
        User user = new User();
        user.setAge(12);
        user.setName("name");
        user.setMoney(new BigDecimal("134.23"));


        userRepository.save(user);
        System.out.println("user:"+user.toString());
        /*user.setId(null);
        userRepository.save(user);
        user.setId(null);
        userRepository.save(user);*/
    }

    @Test
    public void getUser(){
        User user = userRepository.findOne(3L);
        System.out.println("user:"+user.toString());
    }

}