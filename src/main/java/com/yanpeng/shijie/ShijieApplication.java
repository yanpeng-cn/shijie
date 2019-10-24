package com.yanpeng.shijie;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("mapper/*.xml")
public class ShijieApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShijieApplication.class, args);
    }

}
