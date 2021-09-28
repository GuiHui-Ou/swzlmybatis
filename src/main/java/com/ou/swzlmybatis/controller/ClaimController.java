package com.ou.swzlmybatis.controller;


import com.ou.swzlmybatis.common.Result;
import com.ou.swzlmybatis.entity.po.Claim;
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

    @RequestMapping(value = "/query",method = RequestMethod.GET)
    public Result<Claim> queryClaim(Integer Id){
        Claim claim = claimService.queryClaim(1);
        return Result.OK(claim);
    }

}
