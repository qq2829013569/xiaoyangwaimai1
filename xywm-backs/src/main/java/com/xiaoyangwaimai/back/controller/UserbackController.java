package com.xiaoyangwaimai.back.controller;

import com.xiaoyangwaimai.pojo.dto.UserbackDto;
import com.xiaoyangwaimai.back.server.UserbackServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.xiaoyangwaimai.pojo.CommonResult;

@RestController
@RequestMapping("/userback")
public class UserbackController {

    @Autowired
    private UserbackServer userbackServer;

    @PostMapping("/insertUser")
    public CommonResult insertUser(@RequestBody(required = false) UserbackDto userbackDto){
        return userbackServer.insertUser(userbackDto);
    }
}
