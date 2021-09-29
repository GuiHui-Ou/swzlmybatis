package com.ou.swzlmybatis.service;

import com.ou.swzlmybatis.entity.dto.ClaimDTO;
import com.ou.swzlmybatis.entity.po.Claim;

import java.util.List;

/**
 * @author leo
 */
public interface IClaimService {

    /**
     * 插入认领信息
     * @param claimDTO
     * @return
     */
    boolean insertClaim(ClaimDTO claimDTO);

    /**
     * 查找认领信息
     * @param claimId
     * @return
     */
    Claim queryClaim(Integer claimId);
}
