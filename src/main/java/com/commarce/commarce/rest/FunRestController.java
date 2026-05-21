package com.commarce.commarce.rest;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @GetMapping("/")
    public String Home() {
        return "hello World";
    }

    @Value("${coach.name}")
    private String CoachName;

    @Value("${spring.application.name}")
    private String ApplicationName;
}
