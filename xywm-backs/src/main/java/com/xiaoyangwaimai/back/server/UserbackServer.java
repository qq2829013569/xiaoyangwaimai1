package com.xiaoyangwaimai.back.server;

import com.xiaoyangwaimai.pojo.dto.UserbackDto;
import com.xiaoyangwaimai.pojo.CommonResult;

public interface UserbackServer {

    CommonResult insertUser(UserbackDto userbackDto);
}
