package com.ou.swzlmybatis.controller;

import com.ou.swzlmybatis.common.Result;
import com.ou.swzlmybatis.entity.dto.UserDTO;
import com.ou.swzlmybatis.entity.request.UserRequest;
import com.ou.swzlmybatis.service.IUserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.ou.swzlmybatis.entity.po.User;

/**
 * @author leo
 */
@RestController
@RequestMapping(value = "/user")
@Api(tags = "用户信息")
public class UserController{

    @Autowired
    IUserService userService;

    @PostMapping("/register")
    public Result userRegister(@RequestBody UserDTO userDTO){
        Boolean res = userService.userRegister(userDTO);
        return res ? Result.OK() : Result.error("注册失败");
    }

    @PostMapping("/login")
    public Result userLogin(@RequestBody UserRequest request){
        Boolean res = userService.userLogin(request.getUserMobile(),request.getUserPassword());
        return res ? Result.OK() : Result.error("没有该用户");
    }

}
