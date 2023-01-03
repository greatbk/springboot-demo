package com.example.springbootdemo.biz.service;

import com.example.springbootdemo.biz.repository.DemoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class DemoService {
    private final DemoRepository demoRepository;

    public List<String> fruits() {
        try {
            return demoRepository.findFruits();
        } catch (final Exception e) {
            throw new RuntimeException("###ERROR");
        }
    }
}
