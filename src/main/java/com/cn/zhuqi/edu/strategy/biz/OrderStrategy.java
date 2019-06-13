package com.cn.zhuqi.edu.strategy.biz;


import com.cn.zhuqi.edu.strategy.dto.Order;

/**
 * 处理订单策略
 */
public interface OrderStrategy {

    void handleOrder(Order order);
}