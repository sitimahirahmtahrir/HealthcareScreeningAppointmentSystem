package com.kpjjohor.healthcare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.kpjjohor.healthcare.repository")
@EntityScan(basePackages = "com.kpjjohor.healthcare.model")
@ConfigurationProperties(prefix = "hsas")
@EnableConfigurationProperties
public class HsasApplication {

    private String title;
    private String description;

    public static void main(String[] args) {
        SpringApplication.run(HsasApplication.class, args);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}