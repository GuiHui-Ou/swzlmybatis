package com.ou.swzlmybatis.service;


import com.ou.swzlmybatis.entity.po.Manage;

/**
 * @author leo
 */
public interface IManageService {

    boolean manageLogin(String managementMobile , String managementPassword);

}
