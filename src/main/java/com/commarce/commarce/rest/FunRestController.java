package com.commarce.commarce.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import util.Coach;

@RestController
public class FunRestController {

    @GetMapping("/")
    public String Home() {
        return "hello World";
    }

    // dependency injection
    private final Coach myCoach;

    // constructor injection: Spring will provide a Coach implementation
    //in Qualifier always use Camel Case use with constractor
    @Autowired
    public FunRestController(@Qualifier("trackCoach") Coach coach) {
        this.myCoach = coach;
    }

    @GetMapping("/daily-workout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

}
