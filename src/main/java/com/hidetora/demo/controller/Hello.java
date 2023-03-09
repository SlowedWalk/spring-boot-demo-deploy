package com.hidetora.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Hello {
    
    @GetMapping("/")
    public Map<String, String> index() {
        Map<String, String> map = new HashMap<>();
        map.put("name", "Hidetora");
        map.put("age", "20");
        map.put("address", "Tokyo");
        map.put("job", "Engineer");
        return map;
    }
}
