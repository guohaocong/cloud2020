package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;
import org.springframework.web.bind.annotation.PathVariable;

public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(@PathVariable Long id);
}
