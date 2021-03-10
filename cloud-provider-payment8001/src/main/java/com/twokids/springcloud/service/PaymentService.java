package com.twokids.springcloud.service;

import com.twokids.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author ：nanshan
 * @mail : wangchunjie@babychan.com
 * @date ：Created in 2021/3/9 14:50
 * @description：
 */
public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
