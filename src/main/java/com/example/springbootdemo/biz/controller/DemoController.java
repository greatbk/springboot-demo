package com.example.springbootdemo.biz.controller;

import com.example.springbootdemo.biz.service.DemoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class DemoController {
    private final DemoService demoService;

    @GetMapping("/fruits")
    public ResponseEntity<List<String>> fruits() {
        return ResponseEntity.ok(demoService.fruits());
    }
}
