package com.ou.swzlmybatis.entity.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * @author leo
 */
@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class GoodsRequest {

    private Integer goodsId;

    private String goodsType;

    private Integer goodsStatus;

    private String goodsName;

}
