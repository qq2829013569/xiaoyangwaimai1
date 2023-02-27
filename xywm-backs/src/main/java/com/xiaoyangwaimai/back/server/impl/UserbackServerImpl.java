package com.xiaoyangwaimai.back.server.impl;

import com.xiaoyangwaimai.back.dao.UserbackDao;
import com.xiaoyangwaimai.pojo.dto.UserbackDto;
import com.xiaoyangwaimai.pojo.po.UserbackPo;
import com.xiaoyangwaimai.back.server.UserbackServer;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import com.xiaoyangwaimai.pojo.CommonResult;

import javax.annotation.Resource;
import java.util.Date;

@Service
public class UserbackServerImpl implements UserbackServer {

    @Resource
    private UserbackDao userbackDao;

    public CommonResult insertUser(UserbackDto userbackDto) {
        UserbackPo userbackPo = new UserbackPo();
        userbackDto.setCreateTime(new Date());
        BeanUtils.copyProperties(userbackDto,userbackPo);
        int map = userbackDao.insertUser(userbackPo);
        if(map<0){
            return new CommonResult(CommonResult.ERROR_CODE,"操作失败",null);
        }
        return new CommonResult(CommonResult.SUCCESS_CODE,"操作成功",map);
    }
}
