package com.example.boot.config.exception;

import java.util.Date;

public class ExceptionInfo {

    private Date timestamp;
    private int code;
    private String message;

    public ExceptionInfo(Date timestamp, int code, String message) {
        this.timestamp = timestamp;
        this.code = code;
        this.message = message;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
