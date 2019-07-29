package com.stackroute.domain;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
public  class Movie {
    private Actor actor;
    public Movie() {
    }
    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }
    public Movie(Actor actor) {
        this.actor = actor;
    }
    public Actor getActor() {
        return actor;
    }
    @Autowired
    public void setActor(Actor actor) {
        this.actor = actor;
    }
}