package com.ou.swzlmybatis.mapper;

import com.ou.swzlmybatis.entity.dto.UserDTO;
import com.ou.swzlmybatis.entity.po.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author leo
 */
@Mapper
@Repository
public interface UserMapper  {

    /**
     * 用户注册
     * @param userName
     * @param userMobile
     * @param userPassword
     * @return
     */
    boolean userRegister(String userName,String userMobile,String userPassword);

    /**
     * 查找用户
     * @param userMobile
     * @param userPassword
     * @return
     */
    User queryUser(String userMobile , String userPassword);
}
