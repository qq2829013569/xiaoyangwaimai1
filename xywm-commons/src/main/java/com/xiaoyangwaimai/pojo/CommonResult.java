package com.xiaoyangwaimai.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    public static final Integer SUCCESS_CODE = 200;//操作成功

    public static final Integer NETWORK_ERROR = 405;//网络错误

    public static final Integer ERROR_CODE = 400;//操作失败

    private Integer code;

    private String message;

    private T      date;

}
