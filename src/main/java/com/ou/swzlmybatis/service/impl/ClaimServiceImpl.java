package com.ou.swzlmybatis.service.impl;

import com.ou.swzlmybatis.entity.po.Claim;
import com.ou.swzlmybatis.mapper.ClaimMapper;
import com.ou.swzlmybatis.service.IClaimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author leo
 */
@Service
public class ClaimServiceImpl implements IClaimService {

    @Autowired
    ClaimMapper claimMapper;

    @Override
    public Claim queryClaim(Integer Id) {
        Claim claim = claimMapper.queryClaim(Id);
        return claim;
    }
}
