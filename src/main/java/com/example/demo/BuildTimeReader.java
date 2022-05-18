package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import java.util.Properties;


public class BuildTimeReader implements CommandLineRunner {

    @Value("${buildTime}")
    private String buildTime;

    public static void printBuildTime(String[] args) {
        SpringApplication application = new SpringApplication(BuildTimeReader.class);
        Properties properties = new Properties();
        properties.setProperty("spring.main.banner-mode", "off");
        properties.setProperty("logging.pattern.console", "");
        application.setDefaultProperties(properties);
        application.run(args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(buildTime);
    }
}
