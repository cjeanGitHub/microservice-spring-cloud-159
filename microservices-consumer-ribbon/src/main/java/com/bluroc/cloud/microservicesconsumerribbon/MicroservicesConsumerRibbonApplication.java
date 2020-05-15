package com.bluroc.cloud.microservicesconsumerribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient //都是能够让注册中心能够发现，扫描到该服务
@SpringBootApplication
@EnableHystrix  //启动熔断降级服务
@EnableCircuitBreaker //开启断路器功能
@EnableHystrixDashboard // 没有这个注解熔断监视器仪表盘板找不到这个服务，作用：该注解是让该项目成为一个Hystrix仪表盘
public class MicroservicesConsumerRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicesConsumerRibbonApplication.class, args);
    }
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
