package com.example.boot.config.exception;

import java.util.EnumSet;

public enum ExceptionEnum {

    NODATA(101, "NoData"),
    INVALID_REQUEST(102, "Invalid Request");

    private int code;
    private String message;

    ExceptionEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
