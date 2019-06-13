package com.cn.zhuqi.edu.design.mode.service;

import com.cn.zhuqi.edu.strategy.dto.Order;
import com.cn.zhuqi.edu.strategy.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class EduDesignModeServiceApplicationTests {

    @Autowired
    private OrderService orderService;

    @Test
    public void orderHandler() {
        Order order=new Order();
        order.setType("3");
        order.setName("name");
        order.setPrice(1.01);
        orderService.handleOrder(order);
    }

}
