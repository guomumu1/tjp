package com.jrx.tjp.oracle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 服务启动类
 * @author zwg
 * @date 2018/2/26.
 */
@SpringBootApplication
public class StartOracleAppTest {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(StartOracleAppTest.class);
        app.run(args);
    }
}
