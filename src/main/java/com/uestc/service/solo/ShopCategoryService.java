package com.uestc.service.solo;

import com.uestc.entity.bo.ShopCategory;
import com.uestc.entity.dto.Result;

import java.util.List;

/**
 * @author yzz
 * @create 2022-04-19 15:46
 */
public interface ShopCategoryService {
    Result<Boolean> addShopCategory(ShopCategory shopCategory);
    Result<Boolean> removeShopCategory(int shopCategoryId);
    Result<Boolean> modifyShopCategory(ShopCategory shopCategory);
    Result<ShopCategory> queryShopCategoryById(int shopCategoryId);
    Result<List<ShopCategory>> queryShopCategory(ShopCategory shopCategoryCondition, int pageIndex, int pageSize);
}
