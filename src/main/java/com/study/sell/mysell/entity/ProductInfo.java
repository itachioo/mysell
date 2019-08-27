package com.study.sell.mysell.entity;
import com.study.sell.mysell.enums.ProductStatusEnum;
import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;


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
    private Integer productPrice;

    /** 商品库存 */
    private Integer productStock;

    /** 商品类别 */
    private Integer categoryType;

    /** 商品描述 */
    private String productDescription;

    private String productIcon;

    /** 状态 0正常，1下架 */
    private Integer productStatus= 0;

    private Date createTime;

    private Date updateTime;

}
