package com.aegisep.openapi.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Slf4j
@ControllerAdvice
public class ResidentsControllerAdvice {
    /**
     * Aegis api naming rule
     *
     * Class 명 및 Field 명은 Java 공통 표기법인 카멜 표기법을 기본으로 표기한다.
     *
     * Package : 소문자 기본
     *   com.aegisep.<명사>
     *       com.aegisep.openapi.dto
     *
     * Rest Controller
     *   class 명 : <테이블이름>Controller
     *     com.aegisep.openapi.controller.ResidentsController
     *
     *   Method 명 : 접두사<테이블이름>
     *     public Object getResidents : select 단일 쿼리 메인 테이블명 기준
     *     public Object putResidents : insert 쿼리 테이블명 기준
     *     public Object deleteResidents : delete 쿼리 테이블명 기준
     *     public Object patchResidents : update 쿼리 테이블명 기준
     *
     */
    @ExceptionHandler({RuntimeException.class, JsonProcessingException.class})
    public ResponseEntity<String> exceptionHandler(Exception e) {
        log.error(e.getMessage());
        return ResponseEntity.internalServerError()
                .contentType(MediaType.APPLICATION_JSON)
                .body("{\"msg\": \"에러가 발생했습니다. 잠시 후 다시 시도해주세요.\"}");
    }
}
