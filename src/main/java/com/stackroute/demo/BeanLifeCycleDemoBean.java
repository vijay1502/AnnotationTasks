package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class BeanLifeCycleDemoBean implements InitializingBean, DisposableBean {
    public void myMethod(){
        System.out.println("This is my Method");
    }
    public void myActor(){
        Actor actor=new Actor();
        System.out.println(actor.toString());
    }
    public void myMovie(){
        Movie movie=new Movie();
        System.out.println(movie.toString());
    }

    public void customInit(){
        System.out.println("After Bean Instantiation");
    }
    public void customDestroy(){
        System.out.println("Before Bean Destroying");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean going through property set method");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Bean on Destroy");
    }
}
