package com.study.sell.mysell.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class OrderDetail {
    @Id
    private String detailId;

    private String orderId;

    private String productId;

    private String productName;

    private int productPrice;

    private String productDescription;

    private String productIcon;

    private String productQuantity;
}
