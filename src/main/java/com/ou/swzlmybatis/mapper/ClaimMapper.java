package com.ou.swzlmybatis.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import com.ou.swzlmybatis.entity.po.Claim;

/**
 * @author leo
 */
@Repository
public interface ClaimMapper  {

    /**
     * 查找Claim
     * @param Id
     * @return
     */
    Claim queryClaim(Integer Id);
}
