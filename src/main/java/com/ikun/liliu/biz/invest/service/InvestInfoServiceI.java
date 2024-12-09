package com.ikun.liliu.biz.invest.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.ikun.liliu.base.dto.PageO;
import com.ikun.liliu.biz.invest.entity.InvestInfo;
import com.ikun.liliu.biz.invest.mapper.InvestPoiMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.apache.commons.lang3.StringUtils;

/**
 * @author shaxiao
 * @ymd 20241208(星期日)
 * @time 20:16
 * @saysome :
 */
@Service
public class InvestInfoServiceI implements InvestInfoService
{
    @Autowired
    private InvestPoiMapper mapper;

    @Override
    public void save(InvestInfo info)
    {
        mapper.insert(info);

    }

    @Override
    public PageO<InvestInfo> list(PageO<InvestInfo> page)
    {
        LambdaQueryWrapper<InvestInfo> lam = Wrappers.lambdaQuery();
        InvestInfo o = page.getO();
        if (o != null) {
            String uid = StringUtils.trimToNull(o.getUid()), userName = StringUtils.trimToNull(o.getUserName()), placeName = StringUtils.trimToNull(o.getPlaceName());
            lam.eq(uid != null, InvestInfo::getUid, uid);
            lam.like(userName != null, InvestInfo::getUserName, userName);
            lam.like(placeName != null, InvestInfo::getPlaceName, placeName);
        }
        lam.orderByDesc(InvestInfo::getId);
        PageO<InvestInfo> p = mapper.selectPage(page, lam);
        return p;
    }
}
