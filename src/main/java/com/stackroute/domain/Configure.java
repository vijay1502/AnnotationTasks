package com.stackroute.domain;
import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configure{
    Actor actor1,actor2,actor3;
    @Bean(name = "actor1")
    public Actor getActor1(){
        actor1 = new Actor("Ravi","male",50);
        return actor1;
    }
    @Bean(name = "actor2")
    public Actor getActor2(){
        actor2 = new Actor("Balayya","male",60);
        return actor2;
    }
    @Bean(name = "actor3")
    public Actor getActor3(){
        actor3 = new Actor("Vijay Konda","male",30);
        return actor3;
    }
    @Bean(name = "movie1")
    public Movie getMovie1(){
        Movie movie1 = new Movie();
        movie1.setActor1(actor1);
        movie1.setActor2(actor2);
        movie1.setActor3(actor3);
        return movie1;
    }

}