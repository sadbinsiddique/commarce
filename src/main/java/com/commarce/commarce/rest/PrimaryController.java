package com.commarce.commarce.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import util.Coach;

@RestController
public class PrimaryController {

    private final Coach myCoach;

    @Autowired
    public PrimaryController(Coach theCoach) {
        this.myCoach = theCoach;
    }

    @GetMapping("/primary")
    public String getPrimary() {
        return myCoach.getDailyWorkout();
    }

}
