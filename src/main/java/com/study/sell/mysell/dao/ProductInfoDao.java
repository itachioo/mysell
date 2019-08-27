package com.study.sell.mysell.dao;

import com.study.sell.mysell.entity.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductInfoDao extends JpaRepository<ProductInfo,String> {

}
