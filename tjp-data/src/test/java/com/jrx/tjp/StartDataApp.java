package com.jrx.tjp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 服务启动类
 * @author zwg
 * @date 2018/2/26.
 */
@SpringBootApplication
//@MapperScan({"com.jrx.tjp.mybatis.mapper"})
public class StartDataApp {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(StartDataApp.class);
        app.run(args);
    }
}
