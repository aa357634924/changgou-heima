package com.rj.springboot.handler;

import com.rj.springboot.entitiy.Result;
import com.rj.springboot.entitiy.StatusCode;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: rj
 * @Date: 2020-04-02 14:26
 * @Version: 1.0
 * 统一异常处理类
 */
//@ControllerAdvice
public class BaseExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result error(Exception e){
        e.printStackTrace();
        return new Result(false, StatusCode.ERROR,e.getMessage());
    }
}
