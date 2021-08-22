package com.narendra.testcontainer.dyb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

import javax.persistence.Cacheable;

@SpringBootApplication
@EnableCaching
public class TestContainersApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestContainersApplication.class, args);
    }

}
