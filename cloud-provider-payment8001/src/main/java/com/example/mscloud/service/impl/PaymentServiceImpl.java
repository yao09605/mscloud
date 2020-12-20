package com.example.mscloud.service.impl;

import com.example.mscloud.dao.PaymentDao;
import com.example.mscloud.service.PaymentService;
import entities.Payment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("PaymentService")
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id){
        return paymentDao.getPaymentById(id);
    }
}
