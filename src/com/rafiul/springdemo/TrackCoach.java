package com.rafiul.springdemo;

public class TrackCoach implements Coach {
    @Override
    public String getdailyworkout() {
        return "run as hard as 5k";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
