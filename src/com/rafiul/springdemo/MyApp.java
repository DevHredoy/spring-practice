package com.rafiul.springdemo;

public class MyApp {
    public static void main(String[] args) {
        //create the object
        Coach baseballCoach=new BaseballCoach();
        //using the object
        System.out.println(baseballCoach.getdailyworkout());
        Coach trackcoach=new TrackCoach();

        System.out.println(trackcoach.getdailyworkout());
    }
}
