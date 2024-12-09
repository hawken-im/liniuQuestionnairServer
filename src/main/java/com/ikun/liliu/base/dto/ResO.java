package com.ikun.liliu.base.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

/**
 * @author shaxiao
 * @ymd 20241208(星期日)
 * @time 20:32
 * @saysome :
 */
@NoArgsConstructor
@Data
public class ResO<O>
{
    private int code;
    private O data;
    private Collection<O> datas;
    private String msg;
    public ResO(int code,String msg)
    {
        this.code=code;
        this.msg=msg;
    }

    public static ResO build(int code)
    {
        return build(code,null);
    }
    public static ResO build(int code,String msg)
    {
        return new ResO(code,msg);
    }

    public ResO<O> data(O data)
    {
        this.data=data;
        return this;
    }

    public ResO<O> datas(Collection<O> datas)
    {
        this.datas=datas;
        return this;
    }
}
