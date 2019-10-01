package com.stackroute.domain;

public class Movie {
    private Actor actor;
    public void setActor(Actor actor) {
        this.actor = actor;
    }
    public void ActorInfo(){
        actor.ActorDetails();
    }

}
