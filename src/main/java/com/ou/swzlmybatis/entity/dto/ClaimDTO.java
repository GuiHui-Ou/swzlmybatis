package com.ou.swzlmybatis.entity.dto;

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
public class ClaimDTO {

    private Integer claimId;

    private String claimDesc;

    private String claimUser;

    private Date claimTime;

    public Claim toClaimPO() {
        Claim claim = new Claim();
        claim.setClaimId(this.claimId);
        claim.setClaimDesc(this.claimDesc);
        claim.setClaimUser(this.claimUser);
        claim.setClaimTime(this.claimTime);
        return claim;
    }
}
