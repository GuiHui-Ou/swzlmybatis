package com.ou.swzlmybatis.service.impl;


import com.ou.swzlmybatis.entity.po.Manage;
import com.ou.swzlmybatis.entity.po.User;
import com.ou.swzlmybatis.mapper.ManageMapper;
import com.ou.swzlmybatis.service.IManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author leo
 */
@Service
public class ManageServiceImpl implements IManageService {

    @Autowired
    ManageMapper manageMapper;

    @Override
    public boolean manageLogin(String managementMobile, String managementPassword) {
        if (managementMobile != null && managementPassword != null){
            Manage manage = manageMapper.queryManage(managementMobile,managementPassword);
            if (manage != null){
                return true;
            }
        }
        return false;
    }
}
