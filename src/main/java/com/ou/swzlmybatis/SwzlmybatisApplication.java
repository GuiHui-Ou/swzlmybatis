package com.ou.swzlmybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.ou.swzlmybatis.mapper")
@SpringBootApplication
public class SwzlmybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SwzlmybatisApplication.class, args);
    }

}
