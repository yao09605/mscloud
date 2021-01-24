package com.example.mscloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.example.mscloud.dao"})
public class DroolsMain7015 {
    public static void main(String[] args) {
        SpringApplication.run(DroolsMain7015.class,args);
    }
}
