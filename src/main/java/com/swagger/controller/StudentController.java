package com.swagger.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping
    public String studentResponse(@RequestParam("greeting") String greeting) {
        return greeting + " Good Morning, Sir...!!";
    }

}
