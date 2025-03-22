package com.example.cistron_main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class cistronMainApplication {
    public static void main(String[] args) {
        System.out.println(router.hello()); 
        SpringApplication.run(cistronMainApplication.class, args);
        
    }
}
