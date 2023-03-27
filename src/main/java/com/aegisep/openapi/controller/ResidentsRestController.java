package com.aegisep.openapi.controller;

import com.aegisep.openapi.service.ResidentsService;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@Slf4j
public class ResidentsRestController {
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
    @Autowired
    ResidentsService residentsService;

    @Autowired
    ObjectMapper objectMapper;

    @Operation(summary = "테스트 조회", description = "이지스엔터프라이즈 api")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "OK !!"),
            @ApiResponse(responseCode = "400", description = "BAD REQUEST !!"),
            @ApiResponse(responseCode = "500", description = "INTERNAL SERVER ERROR !!")
    })
    @GetMapping(value = "/hello", produces = "application/json; charset=UTF-8")
    public ResponseEntity<String> getHello() {
        log.info("hello world current time : {}", LocalDateTime.now());
        return ResponseEntity.ok("{\"message\":\"hello world\"}");
    }

    @Operation(summary = "테스트 DB 조회", description = "이지스엔터프라이즈 api")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "OK !!"),
            @ApiResponse(responseCode = "400", description = "BAD REQUEST !!"),
            @ApiResponse(responseCode = "500", description = "INTERNAL SERVER ERROR !!")
    })
    @GetMapping(value = "/sysdate", produces = "application/json; charset=UTF-8")
    public ResponseEntity<String> getSysdate() {
        log.info("sysdate current time : {}", LocalDateTime.now());
        String sysdate = residentsService.getSysdate();
        log.info("sysdate current time : {}", sysdate);
        return ResponseEntity.ok("{\"message\":\""+ sysdate +"\"}");
    }

    @GetMapping(value = "/", produces = "application/json; charset=UTF-8")
    public ResponseEntity<String> health() {
        log.info("welcome open api current time : {}", LocalDateTime.now());
        return ResponseEntity.ok("welcome open api");
    }

}
