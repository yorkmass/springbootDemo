package com.yorkmass.demo.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

/**
 * 用于捕获全局异常
 */

@RestControllerAdvice //控制器切面
public class GlobalExceptionHandle {
/*
    @ExceptionHandler(RuntimeException.class) //捕获运行时异常
    @ResponseBody //返回json
    public Map<String,Object> exceptionHandler(){ //处理异常方法
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("errorCode","101");
        map.put("errorMsg","系统错误");
        return map;
    }

 */
}
