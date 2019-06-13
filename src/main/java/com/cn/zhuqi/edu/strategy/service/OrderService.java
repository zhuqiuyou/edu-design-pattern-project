package com.cn.zhuqi.edu.strategy.service;

import com.cn.zhuqi.edu.strategy.dto.Order;

/**
 * @Author zhuqi
 * @Date 2019-06-13
 * @Version 1.0
 **/
public interface OrderService {

    /**
     * 订单处理Service
     * @param order
     */
    void handleOrder(Order order);
}
