package com.lsk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ProviderProduct8081Application {

    public static void main(String[] args) {
        SpringApplication.run(ProviderProduct8081Application.class, args);
    }

}
