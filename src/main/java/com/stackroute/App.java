package com.stackroute;
import com.stackroute.domain.Actor;
import com.stackroute.domain.Configure;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(Configure.class);
        Actor actor1 = context.getBean("actor1", Actor.class);
        Actor actor2 = context.getBean("actor2", Actor.class);
        Actor actor3 = context.getBean("actor3", Actor.class);
        System.out.println(actor1.toString());
        System.out.println(actor2.toString());
        System.out.println(actor3.toString());
        Movie movie1 = context.getBean("movie1",Movie.class);
        
        System.out.println(movie1.toString());

    }
}