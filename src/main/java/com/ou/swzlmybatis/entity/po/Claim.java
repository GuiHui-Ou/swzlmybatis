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
public class Claim {

    private Integer claimId;

    private String claimDesc;

    private String claimUser;

    private Date claimTime;
}
