package com.cn.zhuqi.edu.factory.service.impl;

import com.cn.zhuqi.edu.factory.service.LocationService;

/**
 * @Author zhuqi
 * @Date 2019-06-13
 * @Version 1.0
 **/
public class GaodeLocationServiceImpl implements LocationService {
    
    @Override
    public void getPosition() {
        System.out.println("调用了高德地图");
    }
}
