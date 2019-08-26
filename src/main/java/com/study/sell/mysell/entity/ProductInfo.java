package com.study.sell.mysell.entity;
import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
@Data
/**
 *  data注解可以省去get、set、tostring方法
 *  依赖lombok，同时idea需要安装lombok插件
 */
public class ProductInfo {
    @Id
    private String productId;
    /** 商品名字. */
    private String productName;

    /** 商品单价 */
    private int productPrice;

    /** 商品库存 */
    private int productStock;

    /** 商品类别 */
    private int categoryType;

    /** 商品描述 */
    private String productDescription;

    /** 状态 0正常，1下架 */
    private int productStatus=0;

}
