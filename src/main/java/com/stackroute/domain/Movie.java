package com.stackroute.domain;

public class Movie {
    private Actor actor;
    public Movie(){}

    public Movie(Actor actor1) {
        this.actor = actor1;
    }


    public void ActorInfo(){
        actor.ActorDetails();
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }
}
