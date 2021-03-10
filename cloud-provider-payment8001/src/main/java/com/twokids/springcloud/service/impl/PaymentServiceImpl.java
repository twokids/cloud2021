package com.twokids.springcloud.service.impl;

import com.twokids.springcloud.dao.PaymentDao;
import com.twokids.springcloud.entities.Payment;
import com.twokids.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author ：nanshan
 * @mail : wangchunjie@babychan.com
 * @date ：Created in 2021/3/9 14:52
 * @description：
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
