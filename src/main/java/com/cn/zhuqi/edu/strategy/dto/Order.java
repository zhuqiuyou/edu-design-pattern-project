package com.cn.zhuqi.edu.strategy.dto;

public class Order {
    public static final String FREE = "1"; //免费订单
    public static final String HALF = "2"; //半价订单
    public static final String DISCOUT = "3"; //打折订单

    private String name;
    private Double price;
    private String type;//订单类型



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}