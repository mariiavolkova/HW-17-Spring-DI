package com.volkova.executor;

import com.volkova.beans.Car;
import com.volkova.beans.User;
import com.volkova.configuration.ConfigurationApp;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Executor {
    public void execute(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationApp.class);

        Car car = (Car) context.getBean("car", Car.class);
        User user = context.getBean("user", User.class);

        System.out.println(car + "\n" + user);
    }
}
