package com.study.sell.mysell.entity;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class ProductCategory {
    @Id
    private String categoryId;

    /**类别名称 */
    private String categoryName;

    /**类别编号 */
    private int categoryType;
}
