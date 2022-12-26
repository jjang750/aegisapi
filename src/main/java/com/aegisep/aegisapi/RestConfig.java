package com.aegisep.aegisapi;

import com.aegisep.dto.ResidentsVo;
import com.aegisep.service.ResidentsService;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
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

    private ResidentsService service;

    public RestConfig(){
        this.service = new ResidentsService();
    }

    @GetMapping(value = "/", produces = "application/json; charset=UTF-8")
    public ResponseEntity<String> health() {
        return ResponseEntity.ok("welcome aegis open api");
    }

    @Operation(summary = "입주자정보입력", description = "이지스엔터프라이즈 api example")
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "OK !!"),
        @ApiResponse(responseCode = "400", description = "BAD REQUEST !!"),
        @ApiResponse(responseCode = "500", description = "INTERNAL SERVER ERROR !!")
    })
    @PutMapping(value = "/residents", produces = "application/json; charset=UTF-8")
    public ResponseEntity<String> residents(
        @Parameter(description = "입주자 정보", required = true, example = "{\"commands\":\"{\"command\":\"value\"}\"}")
        @RequestBody HashMap<String, Object> map
    ) {
        log.info("api home");
        log.info("JSON : {}", map);

        ObjectMapper mapper = new ObjectMapper();
        ResidentsVo residents = mapper.convertValue(map, ResidentsVo.class);

        log.info("ResidentsVo : {}", residents);

        service.insert(residents);

        return ResponseEntity.ok("put residents");
    }

}
