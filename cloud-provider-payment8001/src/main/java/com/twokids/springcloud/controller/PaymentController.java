package com.twokids.springcloud.controller;

import com.twokids.springcloud.entities.CommonResult;
import com.twokids.springcloud.entities.Payment;
import com.twokids.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author ：nanshan
 * @mail : wangchunjie@babychan.com
 * @date ：Created in 2021/3/9 14:57
 * @description：
 */
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("PaymentController.create插入结果" + result);
        if (result <= 0) {
            return new CommonResult(500, "error", null);
        }
        return new CommonResult(200, "success", result);
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        Payment paymentInfo = paymentService.getPaymentById(id);
        log.info("PaymentController.getPaymentById 查询结果" + paymentInfo);
        if (paymentInfo == null) {
            return new CommonResult(500, "没有查询到记录", null);
        }
        return new CommonResult(200, "success",paymentInfo);
    }
}
