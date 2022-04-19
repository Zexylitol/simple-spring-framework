package com.uestc.service.solo.impl;

import com.uestc.entity.bo.HeadLine;
import com.uestc.entity.dto.Result;
import com.uestc.service.solo.HeadLineService;

import java.util.List;

/**
 * @author yzz
 * @create 2022-04-19 15:55
 */
public class HeadLineServiceImpl implements HeadLineService {
    @Override
    public Result<Boolean> addHeadLine(HeadLine headLine) {
        return null;
    }

    @Override
    public Result<Boolean> removeHeadLine(int headLineId) {
        return null;
    }

    @Override
    public Result<Boolean> modifyHeadLine(HeadLine headLine) {
        return null;
    }

    @Override
    public Result<HeadLine> queryHeadLineById(int headLineId) {
        return null;
    }

    @Override
    public Result<List<HeadLine>> queryHeadLine(HeadLine headLineCondition, int pageIndex, int pageSize) {
        return null;
    }
}
