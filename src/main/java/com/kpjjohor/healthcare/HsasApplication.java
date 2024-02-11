package com.kpjjohor.healthcare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.kpjjohor.healthcare.repository")
@EntityScan(basePackages = "com.kpjjohor.healthcare.model")
public class HsasApplication {
    public static void main(String[] args) {
        SpringApplication.run(HsasApplication.class, args);
    }
}
