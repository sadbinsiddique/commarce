package com.commarce.commarce.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import util.Coach;

@RestController
public class FunRestController {

    @GetMapping("/")
    public String Home() {
        return "hello World";
    }

    // define a private field for dependency injection
    private final Coach myCoach;

    @Autowired
    // constructor injection: Spring will provide a Coach implementation
    public FunRestController(Coach coach) {
        this.myCoach = coach;
    }

    @GetMapping("/daily-workout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

}
