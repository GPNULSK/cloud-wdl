package com.lsk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
@EnableCircuitBreaker
public class ConsoleOrder8082Application {



    public static void main(String[] args) {
        SpringApplication.run(ConsoleOrder8082Application.class, args);
    }

//    @Bean
//    public RestTemplate restTemplate(){
//        return new RestTemplate();
//    }


}

