package com.tiarebalbi.trainning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ServiceRegistryServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceRegistryServerApplication.class, args);
    }
}
