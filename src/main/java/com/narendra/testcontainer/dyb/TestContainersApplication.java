package com.narendra.testcontainer.dyb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.persistence.Cacheable;

@SpringBootApplication
@EnableCaching
@EnableScheduling
public class TestContainersApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestContainersApplication.class, args);
    }

}
