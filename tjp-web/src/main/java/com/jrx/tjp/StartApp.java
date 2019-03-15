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
        System.out.println("分支一第二次添加");
        System.out.println("分支一在第二个窗口上第二次修改");
        System.out.println("第一个窗口在分支一上修改");
        System.out.println("分支一在第二个窗口修改");
        System.out.println("分支一在窗口一上第二次修改");
        System.out.println("1111111");
        System.out.println("2222222222");
        System.out.println("32333333332");
	
    }
}
