package com.study.sell.mysell.entity;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class OrderInfo {
    @Id
    private String orderId;
    /**买家姓名*/
    private String buyerName;

    /**买家电话*/
    private String buyerPhone;

    /**买家地址*/
    private String address;

    /**订单状态*/
    private int orderStatus;

    /**微信openid*/
    private String buyerOpenid;

    /**支付状态*/
    private int payStatus;

    /**订单总金额*/
    private int orderAmount;

}
