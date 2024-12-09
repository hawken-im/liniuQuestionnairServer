package com.ikun.liliu.biz.invest.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ikun.liliu.base.entity.PO;
import lombok.Data;

/**
 * @author shaxiao
 * @ymd 20241208(星期日)
 * @time 19:48
 * @saysome :
 */
@Data
@TableName("biz_invest_info")
public class InvestInfo extends PO
{
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    private String uid;
    private int uType;
    private String userName;
    private String userTel;
    private String placeName;
    private String placeAddress;
    private int area;
    private int addArea;
    private int remodelingYear;
    private String houseStyle;
    private String hallFloor;
    private int caseID;
    private int caseTimes;
    private int caseStatus;

    public InvestInfo init()
    {
        this.caseID = 0;
        this.caseTimes = 0;
        this.caseStatus = 0;
        return this;
    }
}
