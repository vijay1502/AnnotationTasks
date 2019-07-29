package com.stackroute.domain;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
//import jdk.nashorn.internal.objects.annotations.Constructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class Configure {

@Bean
    public Movie movie(){
    Movie movie=new Movie();

    return movie;

}
    @Bean
    public Actor actor(){
        Actor actor=new Actor();
        actor.setGender("male");
        actor.setName("Vijay");
        actor.setAge(22);

        return actor;
    }

}
