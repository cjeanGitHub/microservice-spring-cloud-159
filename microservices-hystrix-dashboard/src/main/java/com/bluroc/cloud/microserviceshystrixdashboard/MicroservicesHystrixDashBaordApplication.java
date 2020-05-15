package com.bluroc.cloud.microserviceshystrixdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;


@SpringBootApplication
@EnableHystrixDashboard //启动Hystrix仪表盘
public class MicroservicesHystrixDashBaordApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicesHystrixDashBaordApplication.class, args);
        System.out.println("断路监视器负载启动....");
    }

}
