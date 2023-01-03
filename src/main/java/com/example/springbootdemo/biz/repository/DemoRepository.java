package com.example.springbootdemo.biz.repository;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DemoRepository {

    public List<String> findFruits() {
        return List.of("apple", "banana", "cacao");
    }
}
