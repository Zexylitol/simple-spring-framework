package com.uestc.entity.bo;

import lombok.Data;

import java.util.Date;

/**
 * @author yzz
 * @create 2022-04-18 17:45
 */
@Data
public class ShopCategory {
    private Long shopCategoryId;
    private String shopCategoryName;
    private String shopCategoryDesc;
    private String shopCategoryImg;
    private Integer priority;
    private Date createTime;
    private Date lastEditTime;
    private ShopCategory parent;
}
