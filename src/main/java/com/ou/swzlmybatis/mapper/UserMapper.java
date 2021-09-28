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

    boolean userRegister(String userName,String userMobile,String userPassword);

    User queryUser(String userMobile , String userPassword);
}
