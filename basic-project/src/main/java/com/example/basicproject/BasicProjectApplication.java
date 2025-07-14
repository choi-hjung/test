package com.example.basicproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class BasicProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(BasicProjectApplication.class, args);
    }

}
