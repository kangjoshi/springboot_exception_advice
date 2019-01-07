package com.example.boot.config.exception;

public class CustomException extends RuntimeException {

    private int code;
    private String message;

    public CustomException(ExceptionEnum exceptionEnum) {
        this.code = exceptionEnum.getCode();
        this.message = exceptionEnum.getMessage();
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
