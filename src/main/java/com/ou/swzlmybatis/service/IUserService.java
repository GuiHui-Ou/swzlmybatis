package com.ou.swzlmybatis.service;


import com.ou.swzlmybatis.entity.dto.UserDTO;
import com.ou.swzlmybatis.entity.po.User;
import com.ou.swzlmybatis.entity.request.UserRequest;

/**
 * @author leo
 */
public interface IUserService {

    /**
     * 用户注册
     * @param userDTO
     * @return
     */
    boolean userRegister(UserDTO userDTO);

    /**
     * 用户登录
     * @param userMobile
     * @param userPassword
     * @return
     */
    boolean userLogin(String userMobile , String userPassword);


}
