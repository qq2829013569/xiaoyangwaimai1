package com.xiaoyangwaimai.pojo.po;


import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserbackPo {

  @TableId(value = "id",type = IdType.AUTO)
  private long id;

  private String userBackAccount;

  private String userBackPassword;

  private String manageName;

  @TableField(value = "createTime",fill = FieldFill.INSERT)
  private Date createTime;

  @TableField(value = "updateTime",fill = FieldFill.UPDATE)
  private Date updateTime;
}
