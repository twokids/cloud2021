package com.twokids.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author ：nanshan
 * @mail : wangchunjie@babychan.com
 * @date ：Created in 2021/3/10 20:32
 * @description：
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {

    private Long id;

    private String serial;
}
