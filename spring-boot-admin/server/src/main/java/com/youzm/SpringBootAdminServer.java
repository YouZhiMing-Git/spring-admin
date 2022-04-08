package com.youzm;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:youzhiming
 * @date: 2021/11/4
 * @description:
 */

@SpringBootApplication
@EnableAdminServer
public class SpringBootAdminServer {
    /*public static void main(String[] args) {
        SpringApplication.run(SpringApplication.class,args);
    }*/
    public static void main(String[] args) {
        new SpringApplicationBuilder(SpringBootAdminServer.class).web(WebApplicationType.SERVLET).run(args);
//        SpringApplication.run(SpringApplication.class,args);
    }
}
