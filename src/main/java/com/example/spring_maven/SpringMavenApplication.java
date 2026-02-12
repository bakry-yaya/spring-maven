package com.example.spring_maven; 

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringMavenApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMavenApplication.class, args);
    }

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }
}