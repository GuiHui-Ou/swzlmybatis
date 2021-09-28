package com.ou.swzlmybatis.controller;

import com.ou.swzlmybatis.common.Result;
import com.ou.swzlmybatis.entity.request.ManageRequest;
import com.ou.swzlmybatis.entity.request.UserRequest;
import com.ou.swzlmybatis.service.IManageService;
import com.ou.swzlmybatis.service.impl.ManageServiceImpl;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author leo
 */
@RestController
@RequestMapping("/manage")
@Api(tags = "管理员信息")
public class ManageController {

    @Autowired
    IManageService manageService;
    @PostMapping("/login")
    public Result manageLogin(@RequestBody ManageRequest request){
        Boolean res = manageService.manageLogin(request.getManagementMobile(),request.getManagementPassword());
        return res ? Result.OK() : Result.error("没有该用户");
    }

}
