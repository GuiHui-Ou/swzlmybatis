package com.ou.swzlmybatis.service.impl;

import com.ou.swzlmybatis.entity.dto.ClaimDTO;
import com.ou.swzlmybatis.entity.po.Claim;
import com.ou.swzlmybatis.mapper.ClaimMapper;
import com.ou.swzlmybatis.service.IClaimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author leo
 */
@Service
public class ClaimServiceImpl implements IClaimService {

    @Autowired
    ClaimMapper claimMapper;

    @Override
    public boolean insertClaim(ClaimDTO claimDTO) {
        claimMapper.insertClaim(claimDTO);
        return true;
    }

    @Override
    public Claim queryClaim(Integer claimId) {
        return claimMapper.queryClaim(claimId);
    }
}
