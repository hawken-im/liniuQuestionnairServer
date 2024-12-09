package com.ikun.liliu.biz.invest.service;

import com.ikun.liliu.base.dto.PageO;
import com.ikun.liliu.biz.invest.entity.InvestInfo;

import java.util.List;

/**
 * @author shaxiao
 * @ymd 20241208(星期日)
 * @time 20:16
 * @saysome :
 */
public interface InvestInfoService
{

    void save(InvestInfo info);

    PageO<InvestInfo> list(PageO<InvestInfo> page);
}
