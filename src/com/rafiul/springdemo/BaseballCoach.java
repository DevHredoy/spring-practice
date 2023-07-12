package com.rafiul.springdemo;

public class BaseballCoach implements Coach {

    public String getdailyworkout()
    {

        return "spend 30 minutes in batting practice";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
