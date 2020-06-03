package com.guigu.controller;

import com.guigu.entities.CommonResult;
import com.guigu.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@Slf4j
public class OrderController {
    @Resource
    private RestTemplate restTemplate;

    @GetMapping("consumer/payment/save")
    public CommonResult<Payment> save(Payment payment) {
        return restTemplate.postForObject("http://CLOUD-PAYMENT-SERVICE/payment/save", payment, CommonResult.class);
    }

    @GetMapping("consumer/pament/selectId/{id}")
    public CommonResult<Payment> selectId(@PathVariable("id") Long id) {
        log.info("80消费8001成功");
        return restTemplate.getForObject("http://CLOUD-PAYMENT-SERVICE/payment/selectId/" + id, CommonResult.class);
    }
}