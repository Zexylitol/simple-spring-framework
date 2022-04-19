package com.uestc.service.combine;

import com.uestc.entity.dto.MainPageInfoDTO;
import com.uestc.entity.dto.Result;

/**
 * @author yzz
 * @create 2022-04-19 15:57
 */
public interface HeadLineShopCategoryCombineService {
    Result<MainPageInfoDTO> getMainPageInfo();
}
