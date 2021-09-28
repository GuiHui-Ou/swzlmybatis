package com.ou.swzlmybatis.entity.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

/**
 * @author leo
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Manage {

    private Integer Id;

    private String managementMobile;

    private String managementPassword;

}
