package com.study.sell.mysell.mapper;

import com.study.sell.mysell.entity.ProductInfo;

public interface ProductInfoMapper {
    void insert(ProductInfo productInfo);
    ProductInfo getOne(String id);

}
