package com.commarce.commarce.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class DemoRestController {
    // nested path hare we use "/test/hello"

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
