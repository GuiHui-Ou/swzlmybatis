package com.ou.swzlmybatis.service.impl;

import com.ou.swzlmybatis.entity.dto.UserDTO;
import com.ou.swzlmybatis.entity.request.UserRequest;
import com.ou.swzlmybatis.mapper.UserMapper;
import com.ou.swzlmybatis.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ou.swzlmybatis.entity.po.User;

/**
 * @author leo
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public boolean userRegister(UserDTO userDTO) {
        Boolean res = userMapper.userRegister(userDTO.getUserName(), userDTO.getUserMobile(), userDTO.getUserPassword());
        return res;
    }

    @Override
    public boolean userLogin(String userMobile , String userPassword) {
        if (userMobile != null && userPassword != null){
            User user =userMapper.queryUser(userMobile,userPassword);
            if (user != null){
                return true;
            }
        }
        return false;
    }


}
