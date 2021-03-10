package com.twokids.springcloud.dao;

import com.twokids.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author ：nanshan
 * @mail : wangchunjie@babychan.com
 * @date ：Created in 2021/3/5 16:17
 * @description：
 */
@Mapper
public interface PaymentDao {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
