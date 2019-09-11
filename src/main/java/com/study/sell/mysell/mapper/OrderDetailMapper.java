package com.study.sell.mysell.mapper;

import com.study.sell.mysell.entity.OrderDetail;

public interface OrderDetailMapper {
    void insert(OrderDetail orderDetail);
    OrderDetail getById(String orderDetailId);
}
