package com.example.boot.config.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.Date;

@ControllerAdvice
public class AllControllerAdvice {

    @ExceptionHandler(value = Exception.class)
    @ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
    protected @ResponseBody ExceptionInfo handler(Exception exception) {
        return new ExceptionInfo(new Date(), getCode(exception), exception.getMessage());
    }

    private int getCode(Exception exception) {
        if (exception instanceof CustomException) {
            return ((CustomException) exception).getCode();
        } else {
            return HttpStatus.INTERNAL_SERVER_ERROR.value();
        }
    }

}
