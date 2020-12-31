package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author: cYunl
 * Date: 2020/12/22
 * Time: 16:00
 */
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface OrderService {
    @PostMapping(value = "/payment/create")
    CommonResult create(@RequestBody Payment payment);

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);
}
