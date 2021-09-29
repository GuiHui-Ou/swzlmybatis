package com.ou.swzlmybatis.entity.bean;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.ou.swzlmybatis.entity.po.Claim;
import io.swagger.annotations.ApiModel;
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
@ApiModel("认领失物")
public class ClaimInfo {

    private Integer claimId;

    private String claimDesc;

    private String claimUser;

    private Date claimTime;

    public ClaimInfo parseFromPO(Claim po) {
        claimId = po.getClaimId();
        claimDesc = po.getClaimDesc();
        claimUser = po.getClaimUser();
        claimTime = po.getClaimTime();
        return this;
    }
}
