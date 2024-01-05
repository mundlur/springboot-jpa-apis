package com.oracle.dbcs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//enableAutoConfiguration  + Configuration + componentScan
@SpringBootApplication
@EnableAutoConfiguration
@EntityScan(basePackages = "com.oracle.dbcs.bean")
@EnableJpaRepositories(basePackages="com.oracle.dbcs.repository")
public class CourseApiApp {

    public static void main(String args[]) {

        SpringApplication.run(CourseApiApp.class, args);
    }
}
