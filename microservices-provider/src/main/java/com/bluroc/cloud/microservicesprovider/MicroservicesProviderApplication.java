package com.bluroc.cloud.microservicesprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableCircuitBreaker //开启断路器功能
@EnableDiscoveryClient // 都是能够让注册中心能够发现，扫描到该服务
@SpringBootApplication
public class MicroservicesProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicesProviderApplication.class, args);
    }

}
