package com.bluroc.cloud.microservicesconsumerfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableDiscoveryClient //都是能够让注册中心能够发现，扫描到该服务
@EnableFeignClients //启用feign客户端
@SpringBootApplication
@EnableCircuitBreaker//开启断路器功能
public class MicroservicesConsumerFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicesConsumerFeignApplication.class, args);
        System.out.println("Feign 负载启动....");
    }

}
