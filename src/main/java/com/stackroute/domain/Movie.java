package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements BeanNameAware,BeanFactoryAware,ApplicationContextAware{


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

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Going through BeanFactoryAware : "+beanFactory);
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Going through BeanNameAware : "+s);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Going through ApplicationContextAware: "+applicationContext);
    }
}
