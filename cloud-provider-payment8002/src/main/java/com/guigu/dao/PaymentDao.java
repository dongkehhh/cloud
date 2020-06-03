package com.guigu.dao;

import com.guigu.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDao {
    public Payment selectId(@Param("id") Long id);

    public int save(Payment payment);
}
