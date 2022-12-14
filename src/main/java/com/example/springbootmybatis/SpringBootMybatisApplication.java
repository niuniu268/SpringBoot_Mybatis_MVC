package com.example.springbootmybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan("com.example.springbootmybatis.dao")
public class SpringBootMybatisApplication {

    public static void main(String[] args) {


        SpringApplication.run( SpringBootMybatisApplication.class, args );
    }

}
