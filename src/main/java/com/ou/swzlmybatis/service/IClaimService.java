package com.ou.swzlmybatis.service;

import com.ou.swzlmybatis.entity.po.Claim;

/**
 * @author leo
 */
public interface IClaimService {

    /**
     * 查找Claim
     * @param Id
     * @return
     */
    Claim queryClaim(Integer Id);
}
