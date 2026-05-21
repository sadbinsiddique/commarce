package com.commarce.commarce.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import util.Team;


// This is fild injection example. It is not recommended to use fild injection because it is not testable and it is not recommended to use it in production code.
@RestController
public class FildInjectionController {


    @Autowired
    private Team myTeam;


    @GetMapping("/team")
    public String getTeamInfo() {
        return myTeam.getName();
    }

}
