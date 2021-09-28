package com.ou.swzlmybatis.service;


import com.ou.swzlmybatis.entity.dto.UserDTO;
import com.ou.swzlmybatis.entity.po.User;
import com.ou.swzlmybatis.entity.request.UserRequest;

/**
 * @author leo
 */
public interface IUserService {

    boolean userRegister(UserDTO userDTO);

    boolean userLogin(String userMobile , String userPassword);


}
