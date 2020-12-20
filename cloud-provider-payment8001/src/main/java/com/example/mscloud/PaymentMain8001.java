package com.example.mscloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author yaochenli
 * @create 2020-12-17
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.example.mscloud.dao"})
public class PaymentMain8001 {
    public static void main(String[] args){
        SpringApplication.run(PaymentMain8001.class, args);
    }
}
