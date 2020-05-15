package com.bluroc.cloud.microservicediscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@EnableEurekaServer //项目作为SpringCloud中的注册中心
@SpringBootApplication
public class MicroserviceDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceDiscoveryApplication.class, args);
        System.out.println("服务注册中心开启...");
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

}
