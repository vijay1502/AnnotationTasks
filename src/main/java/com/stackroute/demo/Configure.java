package com.stackroute.demo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Configuration
public class Configure{

    @Bean(name="movie")
    public Movie movie(){
        Movie movie=new Movie();
        System.out.println(movie.toString());
        return movie;
    }
    @Bean(name="demobean")
    public BeanPostProcessorDemoBean beanDemo(){
        BeanPostProcessorDemoBean beanDemo =new BeanPostProcessorDemoBean();
        return beanDemo;
    }

}