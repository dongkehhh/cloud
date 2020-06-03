package com.guigu.service.impl;

import com.guigu.dao.PaymentDao;
import com.guigu.entities.Payment;
import com.guigu.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceimpl implements PaymentService {
    @Autowired
    private PaymentDao paymentDao;
    public Payment selectId(Long id){
        return paymentDao.selectId(id);
    }

    public int save(Payment payment){
        return paymentDao.save(payment);
    }

}
