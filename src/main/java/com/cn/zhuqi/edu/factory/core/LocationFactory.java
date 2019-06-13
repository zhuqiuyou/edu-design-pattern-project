package com.cn.zhuqi.edu.factory.core;

import com.cn.zhuqi.edu.factory.service.LocationService;
import com.cn.zhuqi.edu.factory.service.impl.BaiduLocationServiceImpl;
import com.cn.zhuqi.edu.factory.service.impl.GaodeLocationServiceImpl;

/**
 * @Author zhuqi
 * @Date 2019-06-13
 * @Version 1.0
 **/
public class LocationFactory {

    public static LocationService getInstance(String type){
        if("baidu".equals(type)){
            return new BaiduLocationServiceImpl();
        }else {
            return new GaodeLocationServiceImpl();
        }
    }
}
