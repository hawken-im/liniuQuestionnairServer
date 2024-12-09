package com.ikun.liliu.base.exception;

import com.ikun.liliu.base.dto.ResO;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author shaxiao
 * @ymd 20241209(星期一)
 * @time 1:41
 * @saysome :
 */
@RestControllerAdvice
public class GlobalExceptionHandler
{


    @ExceptionHandler(BindException.class)
    public ResO bindException(BindException e){
        String msg=e.getBindingResult().getFieldError().getDefaultMessage();
        return ResO.build(400,msg);
    }

}
