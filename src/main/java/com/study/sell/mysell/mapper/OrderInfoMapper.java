package com.study.sell.mysell.mapper;

import com.study.sell.mysell.entity.OrderInfo;

public interface OrderInfoMapper {
    void insert(OrderInfo orderInfo);
    OrderInfo getByOrderId(String orderId);

}
