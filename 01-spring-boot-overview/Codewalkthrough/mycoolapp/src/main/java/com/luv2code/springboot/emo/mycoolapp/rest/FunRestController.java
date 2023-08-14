package com.luv2code.springboot.emo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@RestController
public class FunRestController {

@Value("${coach.name}")
private String coachName;
@Value("${team.name}")
private String teamName;

//
//    public String getCoachName() {
//        return coachName;
//    }
//
//    public void setCoachName(String coachName) {
//        this.coachName = coachName;
//    }
//
//    public String getTeamName() {
//        return teamName;
//    }
//
//    public void setTeamName(String teamName) {
//        this.teamName = teamName;
//    }

@GetMapping("/")
public String sayHello() {
    return "Hello World!";
}
 @GetMapping("/workout")
 public String sayPumpIt() {
      return "You must push the muscle to failure!";
 }

    @GetMapping("/teaminfo")
    public String getTeamInfo() {
        return "Coach:" + coachName + ", Team name: " + teamName;
    }

    @GetMapping("/fortune")
    public String seeFuture() {
        return "You will enjoy a fine meal.";
    }
}
