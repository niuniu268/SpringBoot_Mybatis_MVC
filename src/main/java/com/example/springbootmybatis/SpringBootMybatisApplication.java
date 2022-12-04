package com.example.springbootmybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example"})
@MapperScan(basePackages = {"com.example"})
public class SpringBootMybatisApplication {

    public static void main(String[] args) {


        SpringApplication.run( SpringBootMybatisApplication.class, args );
    }

}
