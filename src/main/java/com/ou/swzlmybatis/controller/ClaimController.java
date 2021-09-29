package com.ou.swzlmybatis.controller;


import com.ou.swzlmybatis.common.Result;
import com.ou.swzlmybatis.entity.dto.ClaimDTO;
import com.ou.swzlmybatis.entity.po.Claim;
import com.ou.swzlmybatis.entity.request.ClaimRequest;
import com.ou.swzlmybatis.service.IClaimService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.security.auth.message.module.ClientAuthModule;

/**
 * @author leo
 */
@RestController
@RequestMapping("/claim")
@Api(tags = "认领信息")
public class ClaimController {

    @Autowired
    IClaimService claimService;

    @PostMapping("/insert")
    public Result insertClaim(@RequestBody ClaimDTO claimDTO){
        Boolean res = claimService.insertClaim(claimDTO);
        return res ? Result.OK() : Result.error("插入失败");
    }

    @GetMapping("/query")
    public Claim queryClaim(@RequestBody ClaimRequest request){
        Claim claim = claimService.queryClaim(request.getClaimId());
        return claim;
    }

}
