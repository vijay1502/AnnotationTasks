package com.stackroute;
import com.stackroute.domain.Actor;
import com.stackroute.domain.Configure;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Configure.class);
        Actor actor = context.getBean("actor",Actor.class);
        System.out.println(actor.toString());
        Actor actor1 = context.getBean("actor1",Actor.class);
        System.out.println(actor1.toString());
        Actor actor2 = context.getBean("actor2",Actor.class);
        System.out.println(actor2.toString());
        Movie movie = context.getBean("movie",Movie.class);
        System.out.println(movie.toString());
        Movie movie1 = context.getBean("movie1",Movie.class);
        System.out.println(movie1.toString());
        System.out.println(movie==movie1);
    }
}