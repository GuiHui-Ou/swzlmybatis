package com.ou.swzlmybatis.mapper;

import com.ou.swzlmybatis.entity.dto.ClaimDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import com.ou.swzlmybatis.entity.po.Claim;

import java.util.List;

/**
 * @author leo
 */
@Mapper
@Repository
public interface ClaimMapper  {

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
