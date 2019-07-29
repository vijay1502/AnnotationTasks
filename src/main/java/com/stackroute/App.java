package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Configure;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Configure.class);

        Actor actorRef = context.getBean("actor",Actor.class);
        System.out.println(actorRef.toString());
        Movie movieRef = context.getBean("movie",Movie.class);
        System.out.println(movieRef.toString());


    }
}
