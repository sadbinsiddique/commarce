package com.commarce.commarce.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SadRestController {
    @Value("${spring.application.name}")
    private String AppName;

    @Value("${coach.name}")
    private String CoachName;

    @GetMapping("/sad")
    public String sad() {
        String Massage = "Hello %s! Welcome to %s Project.";
        return String.format(Massage, CoachName, AppName);

    }
}
