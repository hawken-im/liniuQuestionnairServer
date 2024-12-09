package com.ikun.liliu.biz.invest.controller;

import com.ikun.liliu.base.dto.PageO;
import com.ikun.liliu.base.dto.ResO;
import com.ikun.liliu.biz.invest.dto.InvestInfoAddDTO;
import com.ikun.liliu.biz.invest.dto.InvestInfoDTO;
import com.ikun.liliu.biz.invest.entity.InvestInfo;
import com.ikun.liliu.biz.invest.service.InvestInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import cn.hutool.core.bean.BeanUtil;

import java.util.Date;

/**
 * @author shaxiao
 * @ymd 20241208(星期日)
 * @time 19:47
 * @saysome :
 */
@RestController
@RequestMapping("/invest")
@Slf4j
public class InvestController
{

    @Autowired
    private InvestInfoService service;

    @PostMapping("/info/save")
    public ResO<InvestInfo> infoSave(@RequestBody @Validated InvestInfoAddDTO add)
    {
        InvestInfo info=new InvestInfo();
        BeanUtil.copyProperties(add,info);
        Date date=new Date();
        info.init().createTime(date).modifyTime(date);
        service.save(info);
        return ResO.build(200);
    }

    @PostMapping("/info/list")
    public PageO<InvestInfo> infoList(@RequestBody PageO<InvestInfo> page)
    {
        return service.list(page);
    }
}
