package com.kpjjohor.healthcare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HsasApplication {

    public static void main(String[] args) {
        // SpringApplication.run() method starts the Spring Boot application
        // HsasApplication.class is the primary source defining the context
        // args contains command-line arguments
        SpringApplication.run(HsasApplication.class, args);
    }

}
