package com.ou.swzlmybatis.mapper;

import com.ou.swzlmybatis.entity.po.Manage;
import com.ou.swzlmybatis.entity.po.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author leo
 */
@Mapper
@Repository
public interface ManageMapper  {

    Manage queryManage(String managementMobile , String managementPassword);

}
