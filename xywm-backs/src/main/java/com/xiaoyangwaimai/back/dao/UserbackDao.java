package com.xiaoyangwaimai.back.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xiaoyangwaimai.pojo.po.UserbackPo;
import org.springframework.stereotype.Repository;

@Repository
public interface UserbackDao extends BaseMapper {

    int insertUser(UserbackPo userbackPo);
}
