package com.ou.swzlmybatis.entity.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * @author leo
 */
@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ClaimRequest {

    private Integer claimId;
}
