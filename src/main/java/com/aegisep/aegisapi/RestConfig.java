package com.aegisep.aegisapi;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class RestConfig {

    @GetMapping(value = "/", produces = "application/json; charset=UTF-8")
    public ResponseEntity<String> home() {
        return ResponseEntity.ok("welcome home");
    }

    @GetMapping(value ="/user", produces = "application/json; charset=UTF-8")
    public ResponseEntity<String> user() {
        log.info("user home");
        return ResponseEntity.ok("user home");
    }

    @GetMapping(value ="/admin", produces = "application/json; charset=UTF-8")
    public ResponseEntity<String> admin() {
        log.info("admin home");
        return ResponseEntity.ok("admin home");
    }

    @GetMapping(value ="/api", produces = "application/json; charset=UTF-8")
    public ResponseEntity<String> api() {
        log.info("api home");
        return ResponseEntity.ok("api home");
    }

}
