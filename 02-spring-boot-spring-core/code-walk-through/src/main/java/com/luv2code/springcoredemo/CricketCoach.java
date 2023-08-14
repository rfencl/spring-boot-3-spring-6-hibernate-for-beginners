package com.luv2code.springcoredemo;

import org.springframework.stereotype.Component;

@Component   // Marks the class as a springbean and makes a candidate for dependency injection.
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }
}
