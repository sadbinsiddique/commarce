package com.commarce.commarce.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import util.Coach;

@RestController
public class FunRestController {

    // dependency injection
    private final Coach myCoach;

    // constructor injection: Spring will provide a Coach implementation
    // in Qualifier always use camelCase with constructor
    @Autowired
    public FunRestController(@Qualifier("custom-id") Coach coach) {
        System.out.println("In constructor: " + this.getClass().getSimpleName());
        this.myCoach = coach;
    }
    // add dummy text for check is CI pipeline Working Or Not ?

    @GetMapping("/")
    public String home() {
        return "hello World";
    }

    @GetMapping("/daily-workout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

}
