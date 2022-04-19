package com.uestc.entity.dto;

import com.uestc.entity.bo.HeadLine;
import com.uestc.entity.bo.ShopCategory;
import lombok.Data;

import java.util.List;

/**
 * @author yzz
 * @create 2022-04-19 15:58
 */
@Data
public class MainPageInfoDTO {
    private List<HeadLine> headLineList;
    private List<ShopCategory> shopCategoryList;
}
