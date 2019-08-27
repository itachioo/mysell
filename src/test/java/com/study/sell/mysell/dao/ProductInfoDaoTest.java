package com.study.sell.mysell.dao;

import com.study.sell.mysell.entity.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoDaoTest {
    @Autowired
    private ProductInfoDao productInfoDao;
    @Test
    public void saveTest() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("123456");
        productInfo.setProductName("小布丁");
        productInfo.setProductPrice(2300);
        productInfo.setProductStock(1);
        productInfo.setProductDescription("小布丁很可爱");
        productInfo.setProductIcon("http://xxxxx.jpg");
        productInfo.setProductStatus(0);
        productInfo.setCategoryType(2);

        ProductInfo result = productInfoDao.save(productInfo);
        Assert.assertNotNull(result);

    }
}