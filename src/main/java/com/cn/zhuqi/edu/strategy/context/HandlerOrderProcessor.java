package com.cn.zhuqi.edu.strategy.context;

import com.cn.zhuqi.edu.strategy.biz.OrderStrategy;
import com.cn.zhuqi.edu.strategy.interfaces.HandlerOrderType;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * 策略核心功能,获取所有策略注解的类型
 * 并将对应的class初始化到HandlerOrderContext中
 */
@Component
public class HandlerOrderProcessor implements ApplicationContextAware {
    /**
     * 获取所有的策略Beanclass 加入HandlerOrderContext属性中
     * @param applicationContext
     * @throws BeansException
     */
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        //获取所有策略注解的Bean
        Map<String, Object> orderStrategyMap = applicationContext.getBeansWithAnnotation(HandlerOrderType.class);
        orderStrategyMap.forEach((k,v)->{
            Class<OrderStrategy> orderStrategyClass = (Class<OrderStrategy>) v.getClass();
            String type = orderStrategyClass.getAnnotation(HandlerOrderType.class).value();
            System.out.println("#type="+type);
            //将class加入map中,type作为key
            HandlerOrderContext.orderStrategyBeanMap.put(type,orderStrategyClass);
        });
    }
}