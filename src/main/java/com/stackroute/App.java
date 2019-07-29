package com.stackroute;

import com.stackroute.demo.Actor;
import com.stackroute.demo.BeanLifeCycleDemoBean;
import com.stackroute.demo.Configure;
import com.stackroute.demo.Movie;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ConfigurableApplicationContext context=new AnnotationConfigApplicationContext(Configure.class);

        BeanLifeCycleDemoBean demoBean=context.getBean("demobean", BeanLifeCycleDemoBean.class);
        context.close();
        }
}
