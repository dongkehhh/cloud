package com.guigu.controller;

import com.guigu.entities.CommonResult;
import com.guigu.entities.Payment;
import com.guigu.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class PaymentController {
    @Autowired
    private PaymentService paymentService;
    @Value("${server.port}")
    private String getport;

    @PostMapping("payment/save")
    public CommonResult save(@RequestBody Payment payment){
        int a = paymentService.save(payment);
        log.info(String.valueOf(a));
        if(a>0){
            return new CommonResult(200,"插入成功"+getport,a);
        }else {
            return new CommonResult(500,"失败");
        }
    }

    @GetMapping("payment/selectId/{id}")
    public CommonResult selectId(@PathVariable("id") Long id){
        Payment payment = paymentService.selectId(id);
        log.info("payment");
        if(payment!=null){
            return new CommonResult(200,"查询成功"+getport,payment);
        }else {
            return new CommonResult(500,"失败");
        }
    }
}
