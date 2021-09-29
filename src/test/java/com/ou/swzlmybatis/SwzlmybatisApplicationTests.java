package com.ou.swzlmybatis;


import com.ou.swzlmybatis.entity.po.Claim;
import com.ou.swzlmybatis.mapper.ClaimMapper;
import com.ou.swzlmybatis.service.IClaimService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class SwzlmybatisApplicationTests {

    @Autowired
    ClaimMapper claimMapper;
    @Autowired
    IClaimService claimService;

    @Test
    public void query(){
        Claim claim = claimService.queryClaim(1);
        System.out.println(claim);

    }

}
