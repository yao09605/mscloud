package com.example.mscloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author yaochenli
 * @create 2020-12-17
 */
@EnableEurekaClient
@SpringBootApplication
@MapperScan(basePackages = {"com.example.mscloud.dao"})
public class PaymentMain8001 {
    public static void main(String[] args){
        SpringApplication.run(PaymentMain8001.class, args);
    }
}
