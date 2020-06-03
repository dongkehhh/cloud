package com.guigu.service;

import com.guigu.entities.Payment;

public interface PaymentService {
    public Payment selectId(Long id);
    public int save(Payment payment);
}
