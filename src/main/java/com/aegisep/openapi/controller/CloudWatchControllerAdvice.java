package com.aegisep.openapi.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Slf4j
@ControllerAdvice
public class CloudWatchControllerAdvice {
    @ExceptionHandler(RuntimeException.class)
    public void exceptionHandler(RuntimeException e) {
        log.error(e.getMessage(), e);
    }
}
