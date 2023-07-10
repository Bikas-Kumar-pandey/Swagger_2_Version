package com.swagger.service;

import org.springframework.stereotype.Service;

@Service
public class SwaggerSevice {
    public String swaggerTest(String id) {
        System.out.println(id);
        return "Hello! Bikas";
    }
}
