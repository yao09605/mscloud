package com.example.mscloud.dao;


import entities.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentDao{

    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
