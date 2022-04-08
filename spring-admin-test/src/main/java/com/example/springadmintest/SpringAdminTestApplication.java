package com.example.springadmintest;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class SpringAdminTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringAdminTestApplication.class, args);
    }

}
