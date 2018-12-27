package com.heson.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableFeignClients
@EnableHystrix
@EnableEurekaClient
@SpringBootApplication
public class OrderApplication {
    
    @Bean
    @LoadBalanced//开启负载均衡
    public RestTemplate getreRestTemplate(){
        return new RestTemplate();
    }
    
    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }
}
