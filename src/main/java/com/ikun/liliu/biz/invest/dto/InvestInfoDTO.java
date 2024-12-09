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
public class InvestInfoDTO
{
    private long id;
    private String uid;
    private int uType;
    private String userName;
    private String userTel;
    private String placeName;
}
