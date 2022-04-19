package com.uestc.controller.frontend;

import com.uestc.entity.dto.MainPageInfoDTO;
import com.uestc.entity.dto.Result;
import com.uestc.service.combine.HeadLineShopCategoryCombineService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author yzz
 * @create 2022-04-19 16:47
 */
public class MainPageController {
    private HeadLineShopCategoryCombineService headLineShopCategoryCombineService;
    public Result<MainPageInfoDTO> getMainPageInfo(HttpServletRequest req, HttpServletResponse resp) {
        return headLineShopCategoryCombineService.getMainPageInfo();
    }
}
