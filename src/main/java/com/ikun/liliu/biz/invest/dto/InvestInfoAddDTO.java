package com.ikun.liliu.biz.invest.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

/**
 * @author shaxiao
 * @ymd 20241208(星期日)
 * @time 21:56
 * @saysome :
 */
@Data
public class InvestInfoAddDTO
{
    private String uid;
    private int uType;
    @NotBlank
    @Length(message = "用户名称长度为1-100",min = 1,max = 100)
    private String userName;
    @NotBlank
    @Length(message = "用户电话长度为6-20",min = 6,max = 20)
    private String userTel;
    @NotBlank
    @Length(message = "小区名称长度为3-100",min = 3,max = 100)
    private String placeName;
    @NotBlank
    @Length(message = "小区地址长度为3-100",min = 3,max = 100)
    private String placeAddress;
    private int area;
    private int addArea;
    private int remodelingYear;
    @Length(message = "装修风格长度为超过100",max = 100)
    private String houseStyle;
    @Length(message = "装修风格长度为超过100",max = 100)
    private String hallFloor;
    private int caseID;
    private int caseTimes;
    private int caseStatus;
}
