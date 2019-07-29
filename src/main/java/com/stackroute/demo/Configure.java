package com.stackroute.demo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configure{

    @Bean(name="actor")
    public Actor actor(){
        Actor actor=new Actor();
        System.out.println(actor.toString());
        return actor;
    }

    @Bean(name="movie")
    public Movie movie(){
        Movie movie=new Movie();
        System.out.println(movie.toString());
        return movie;
    }
    @Bean(name="demobean")
    public BeanLifeCycleDemoBean beanDemo(){
        BeanLifeCycleDemoBean beanDemo =new BeanLifeCycleDemoBean();
        return beanDemo;
    }




}