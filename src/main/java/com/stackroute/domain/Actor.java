package com.stackroute.domain;

public class Actor {
    private String name;
    private String gender;
    private int age;

    public Actor(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void ActorDetails(){
        System.out.println("Name : "+name+" || Gender : "+gender+" || Age : "+age);
    }

}
