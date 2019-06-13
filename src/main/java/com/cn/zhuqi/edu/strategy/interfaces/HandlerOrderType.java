package com.cn.zhuqi.edu.strategy.interfaces;

import java.lang.annotation.*;

/**
 *  订单类型注解
 *
 */
@Target(ElementType.TYPE)  //作用在类上
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited  //子类可以继承此注解
public @interface HandlerOrderType {
    /**
     * 策略类型
     * @return
     */
    String value();
}