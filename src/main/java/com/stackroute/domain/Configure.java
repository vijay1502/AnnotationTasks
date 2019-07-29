package com.stackroute.domain;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class Configure {
    @Bean(name="movie")
    public Movie movieBean(){
        Movie movie=new Movie();
        movie.setMovieName("Vijay");
        System.out.println("this is spring moviebean");
        return movie;
    }
    @Bean(name = "actor")
    public Actor actorBean(){
        Actor actor=new Actor();
        actor.setGender("male");
        actor.setName("VIjay");
        actor.setAge(22);
        System.out.println("this is spring actor bean");
        return actor;
    }

}
