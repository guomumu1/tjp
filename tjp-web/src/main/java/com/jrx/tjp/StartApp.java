package com.jrx.tjp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 服务启动类
 * @author zwg
 * @date 2018/2/26.
 */
@SpringBootApplication
public class StartApp {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(StartApp.class);
        app.run(args);
        System.out.println("分支一添加的");
        System.out.println("分支第二次添加");
    }
}
