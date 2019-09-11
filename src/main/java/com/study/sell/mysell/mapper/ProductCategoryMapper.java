package com.study.sell.mysell.mapper;

import com.study.sell.mysell.entity.ProductCategory;

public interface ProductCategoryMapper {
    void insert(ProductCategory productCategory);
    ProductCategory getById(String procategoryId);
}
