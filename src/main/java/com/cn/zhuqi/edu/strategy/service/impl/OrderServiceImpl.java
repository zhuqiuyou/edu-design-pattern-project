package com.cn.zhuqi.edu.strategy.service.impl;

import com.cn.zhuqi.edu.strategy.biz.OrderStrategy;
import com.cn.zhuqi.edu.strategy.context.HandlerOrderContext;
import com.cn.zhuqi.edu.strategy.dto.Order;
import com.cn.zhuqi.edu.strategy.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author zhuqi
 * @Date 2019-06-13
 * @Version 1.0
 **/
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
   private  HandlerOrderContext handlerOrderContext;

    @Override
    public void handleOrder(Order order) {
        System.out.println("开始处理订单");
        //使用策略处理订单
        OrderStrategy orderStrategy = handlerOrderContext.getOrderStrategy(order.getType());
        orderStrategy.handleOrder(order);
    }

}
