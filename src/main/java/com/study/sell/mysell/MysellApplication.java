package com.study.sell.mysell;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.study.sell.mysell.mapper")
public class MysellApplication {

    public static void main(String[] args) {
        SpringApplication.run(MysellApplication.class, args);
    }
}
