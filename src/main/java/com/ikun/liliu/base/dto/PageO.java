package com.ikun.liliu.base.dto;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.metadata.OrderItem;
import lombok.Data;

import java.util.List;

/**
 * @author shaxiao
 * @ymd 20241209(星期一)
 * @time 2:11
 * @saysome :
 */
@Data
public class PageO<O> implements IPage<O>
{
    private O o;
    private List<O> records;
    private long total;
    private long size;
    private long current;

    @Override
    public List<OrderItem> orders()
    {
        return null;
    }

    @Override
    public IPage<O> setSize(long size)
    {
        this.size = size;
        return this;
    }

    @Override
    public IPage<O> setCurrent(long current)
    {
        this.current = current;
        return this;
    }

    @Override
    public IPage<O> setTotal(long total)
    {
        this.total = total;
        return this;
    }

    @Override
    public IPage<O> setRecords(List<O> records)
    {
        this.records = records;
        return this;
    }
}
