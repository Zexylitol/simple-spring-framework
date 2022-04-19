package com.uestc.service.combine.Impl;

import com.uestc.entity.bo.HeadLine;
import com.uestc.entity.bo.ShopCategory;
import com.uestc.entity.dto.MainPageInfoDTO;
import com.uestc.entity.dto.Result;
import com.uestc.service.combine.HeadLineShopCategoryCombineService;
import com.uestc.service.solo.HeadLineService;
import com.uestc.service.solo.ShopCategoryService;

import java.util.List;

/**
 * @author yzz
 * @create 2022-04-19 16:00
 */
public class HeadLineShopCategoryCombineServiceImpl implements HeadLineShopCategoryCombineService {
    private HeadLineService headLineService;
    private ShopCategoryService shopCategoryService;
    @Override
    public Result<MainPageInfoDTO> getMainPageInfo() {
        // 1. 获取头条列表
        HeadLine headLineCond = new HeadLine();
        headLineCond.setEnableStatus(1);
        Result<List<HeadLine>> headLineResult = headLineService.queryHeadLine(headLineCond, 1, 4);
        // 2. 获取店铺类别列表
        ShopCategory shopCategoryCond = new ShopCategory();
        Result<List<ShopCategory>> shopCategoryResult = shopCategoryService.queryShopCategory(shopCategoryCond, 1, 100);
        // 3. 合并两者并返回
        Result<MainPageInfoDTO> result = mergeMainPageInfoResult(headLineResult, shopCategoryResult);
        return result;
    }

    private Result<MainPageInfoDTO> mergeMainPageInfoResult(Result<List<HeadLine>> headLineResult, Result<List<ShopCategory>> shopCategoryResult) {
        return null;
    }
}
