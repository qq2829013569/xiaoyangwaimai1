package com.xiaoyangwaimai.pojo.dto;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserbackDto {

    private String userBackAccount;

    private String userBackPassword;

    private String manageName;

    @TableField(value = "createTime",fill = FieldFill.INSERT)
    private Date createTime;

    @TableField(value = "updateTime",fill = FieldFill.UPDATE)
    private Date updateTime;
}
