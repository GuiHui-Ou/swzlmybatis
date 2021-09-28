package com.ou.swzlmybatis.entity.bean;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.ou.swzlmybatis.entity.po.User;

/**
 * @author leo
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@ApiModel("用户信息")
public class UserInfo {

    @ApiModelProperty("用户Id")
    private Integer userId;

    @ApiModelProperty("用户姓名")
    private String userName;

    @ApiModelProperty("用户密码")
    private String userPassword;

    @ApiModelProperty("用户手机号")
    private String userMobile;

    public UserInfo parseFromPO(User po) {
        userId = po.getUserId();
        userName = po.getUserName();
        userPassword = po.getUserPassword();
        userMobile = po.getUserMobile();
        return this;
    }
}
