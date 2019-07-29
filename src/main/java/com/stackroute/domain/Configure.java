package com.stackroute.domain;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
@Configuration
public class Configure {
    @Bean(name="actor")
    public Actor actor(){
        Actor actor=new Actor("NTR","Male",32);
        return actor;
    }
    @Bean(name="actor1")
    public Actor actor1(){
        Actor actor1=new Actor("Prabhas","Male",37);
        return actor1;
    }
    @Bean(name="actor2")
    public Actor actor2(){
        Actor actor2=new Actor("Vijay","Male",22);
        return actor2;
    }
    @Bean(name="movie")
    @Scope("prototype")
    public Movie movie(){
        Movie movie=new Movie();
        return movie;
    }
    @Bean(name="movie1")
    @Scope("prototype")
    public Movie movie1(){
        Movie movie1=new Movie();
        return movie1;
    }
}