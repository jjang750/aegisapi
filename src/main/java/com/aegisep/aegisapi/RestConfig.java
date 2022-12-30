package com.aegisep.aegisapi;

import com.aegisep.dto.ResidentsVo;
import com.aegisep.service.ResidentsService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@Slf4j
public class RestConfig {

    @Autowired
    ResidentsService residentsService;

    @Autowired
    ObjectMapper objectMapper;

    @GetMapping(value = "/", produces = "application/json; charset=UTF-8")
    public ResponseEntity<String> health() {
        return ResponseEntity.ok("welcome aegis open api");
    }

    @Operation(summary = "입주자정보조회", description = "이지스엔터프라이즈 api example")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "OK !!"),
            @ApiResponse(responseCode = "400", description = "BAD REQUEST !!"),
            @ApiResponse(responseCode = "500", description = "INTERNAL SERVER ERROR !!")
    })
    @GetMapping(value = "/residents", produces = "application/json; charset=UTF-8")
    public ResponseEntity<String> getResidents (
            @Parameter(description = "입주자정보조회", required = true, example = "{\"commands\":\"{\"command\":\"value\"}\"}")
            @RequestBody HashMap<String, Object> map
    ) throws JsonProcessingException {
        log.info("get residents");
        ResidentsVo residents = objectMapper.convertValue(map, ResidentsVo.class);
        log.info("ResidentsVo : {}", residents);
        ResidentsVo selectResidents = residentsService.selectResidents(residents.getAptcode(), residents.getHouse_no());
        return ResponseEntity.ok(objectMapper.writeValueAsString(selectResidents));
    }

    @Operation(summary = "입주자정보입력", description = "이지스엔터프라이즈 api example")
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "OK !!"),
        @ApiResponse(responseCode = "400", description = "BAD REQUEST !!"),
        @ApiResponse(responseCode = "500", description = "INTERNAL SERVER ERROR !!")
    })
    @PutMapping(value = "/residents", produces = "application/json; charset=UTF-8")
    public ResponseEntity<String> putResidents(
        @Parameter(description = "입주자정보입력", required = true, example = "{\"commands\":\"{\"command\":\"value\"}\"}")
        @RequestBody HashMap<String, Object> map
    ) {
        log.info("put residents");

        ResidentsVo residents = objectMapper.convertValue(map, ResidentsVo.class);
        log.info("ResidentsVo : {}", residents);
        residentsService.insert(residents);
        return ResponseEntity.ok("put residents");
    }

}
