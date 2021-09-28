package com.ou.swzlmybatis.entity.po;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @author leo
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Integer userId;

    private String userName;

    private String userPassword;

    private String userMobile;

}
