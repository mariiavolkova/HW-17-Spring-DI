package com.volkova.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
    private final User user;

    @Autowired
    public Car(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Car{" +
                "user=" + user +
                '}';
    }
}
