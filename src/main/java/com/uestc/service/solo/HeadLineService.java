package com.uestc.service.solo;

import com.uestc.entity.bo.HeadLine;
import com.uestc.entity.dto.Result;

import java.util.List;

/**
 * @author yzz
 * @create 2022-04-19 15:46
 */
public interface HeadLineService {
    Result<Boolean> addHeadLine(HeadLine headLine);
    Result<Boolean> removeHeadLine(int headLineId);
    Result<Boolean> modifyHeadLine(HeadLine headLine);
    Result<HeadLine> queryHeadLineById(int headLineId);
    Result<List<HeadLine>> queryHeadLine(HeadLine headLineCondition, int pageIndex, int pageSize);
}
