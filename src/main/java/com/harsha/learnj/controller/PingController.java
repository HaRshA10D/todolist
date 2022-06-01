package com.harsha.learnj.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class PingController {

    @GetMapping("/ping")
    public ResponseEntity<String> ping(@Nullable @RequestHeader(name = "X-User-Name") String UserName, @RequestParam(name = "q") String Query) {
        log.info("Request received from: " + UserName);
        return ResponseEntity.ok("pong, your query: " + Query);
    }
}
