package com.ou.swzlmybatis.entity.po;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

/**
 * @author leo
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Goods {


    private Integer goodsId;

    private String goodsName;

    private String goodsDesc;

    private String goodsPicker;

    private String pickAddress;

    private Date pickTime;

    private String goodsType;

    private Integer goodsStatus;
}
