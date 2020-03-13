package com.crm.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ExceptionEnums {
    SUCCESS(200,"请求成功"),
    PRAM_IS_NULL(400,"参数为空"),
    UN_LOGIN(401,"没有登录");
    /*
        发生异常的状态码
     */
    private int code;
    /*
        异常信息
    */
    private String msg;
}
