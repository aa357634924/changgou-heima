package com.rj.springboot.entitiy;

import com.sun.tracing.dtrace.ArgsAttributes;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 返回结果实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result<T> {

    private boolean flag;//是否成功
    private Integer code;//返回码
    private String message;//返回消息

    private T data;//返回数据

    public Result(boolean flag, Integer code, String message) {
        this(flag,code,message,null);
    }
}
