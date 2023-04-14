package com.vks.profile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class SpringBootProfileApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootProfileApplication.class, args);
    }
}
