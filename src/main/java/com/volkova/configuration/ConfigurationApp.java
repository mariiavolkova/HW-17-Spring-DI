package com.volkova.configuration;

import com.volkova.beans.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.volkova")
public class ConfigurationApp {
    @Bean
    User user() {
        return new User("Maria");
    }
}
