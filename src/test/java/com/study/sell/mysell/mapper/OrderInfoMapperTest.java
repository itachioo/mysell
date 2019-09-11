package com.study.sell.mysell.mapper;


import com.study.sell.mysell.entity.OrderInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderInfoMapperTest {
    @Autowired
    private OrderInfoMapper orderInfoMapper;
    @Test
    public void saveTest() {
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setOrderId("12345678");
        orderInfo.setBuyerName("huanggang11");
        orderInfo.setBuyerPhone("13299003456");
        orderInfo.setAddress("余杭路");
        orderInfo.setOrderStatus(0);
        orderInfo.setBuyerOpenid("dkjwdjwkdjqw");
        orderInfo.setPayStatus(0);
        orderInfo.setOrderAmount(100);
        orderInfoMapper.insert(orderInfo);
    }
}