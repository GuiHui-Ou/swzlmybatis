package com.ou.swzlmybatis.service;


import com.ou.swzlmybatis.entity.po.Manage;

/**
 * @author leo
 */
public interface IManageService {

    /**
     *管理员登录
     * @param managementMobile
     * @param managementPassword
     * @return
     */
    boolean manageLogin(String managementMobile , String managementPassword);

}
