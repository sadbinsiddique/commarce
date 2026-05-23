package com.commarce.commarce.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import util.Coach;

@RestController
public class BeanController {

    private final Coach myCoach;

    @Autowired
    public BeanController(@Qualifier("cricketCoach") Coach myCoach) {
        this.myCoach = myCoach;
        System.out.println("In constructor " + getClass().getSimpleName());
    }

    @GetMapping("/bean")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

}
