package com.commarce.commarce.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import util.SwimCoach;

@Configuration
public class SportConfig {

    @Bean("custom-id")
    public SwimCoach swimCoach() {
        return new SwimCoach();
    }
}
