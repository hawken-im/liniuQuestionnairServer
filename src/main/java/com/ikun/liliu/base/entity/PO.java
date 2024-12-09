package com.ikun.liliu.base.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * @author shaxiao
 * @ymd 20241208(星期日)
 * @time 21:57
 * @saysome :
 */
public class PO
{
    private Date ctime;
    private Date mtime;

    public PO createTime(Date ctime)
    {
        this.ctime = ctime;
        return this;
    }

    public PO modifyTime(Date mtime)
    {
        this.mtime = mtime;
        return this;
    }
}
