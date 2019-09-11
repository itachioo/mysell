package com.study.sell.mysell.mapper;


import com.study.sell.mysell.entity.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoMapperTest {
    @Autowired
    private ProductInfoMapper productInfoMapper;

    @Test
    public void insertTest() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("1234567");
        productInfo.setProductName("小灰灰");
        productInfo.setProductPrice(2300);
        productInfo.setProductStock(1);
        productInfo.setProductDescription("小灰灰很可爱");
        productInfo.setProductIcon("http://xxxxx.jpg");
        productInfo.setProductStatus(0);
        productInfo.setCategoryType(2);
        productInfoMapper.insert(productInfo);

    }

    @Test
    public void getOneTest() {
        String id = "123456";
        ProductInfo productInfo = productInfoMapper.getOne(id);
        System.out.println(productInfo);
    }
}