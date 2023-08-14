package com.luv2code.springcoredemo;

import org.springframework.stereotype.Component;

@Component   // Marks the class as a springbean and makes a candidate for dependency injection.
public class KarateCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice the 4 kick drill 10 times.";
    }
}
