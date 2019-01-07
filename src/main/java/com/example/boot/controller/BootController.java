package com.example.boot.controller;

import com.example.boot.config.exception.CustomException;
import com.example.boot.config.exception.ExceptionEnum;
import com.example.boot.service.BootService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/boot")
public class BootController {

    private BootService bootService;

    BootController(BootService bootService) {
        this.bootService = bootService;
    }


    @GetMapping
    public String index() {
        return "Hello World";
    }

    @GetMapping("/error")
    public void error() {
        throw new CustomException(ExceptionEnum.INVALID_REQUEST);
    }

}
