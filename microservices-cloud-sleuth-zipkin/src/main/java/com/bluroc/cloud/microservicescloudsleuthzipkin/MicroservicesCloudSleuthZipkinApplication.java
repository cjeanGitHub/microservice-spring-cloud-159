package com.bluroc.cloud.microservicescloudsleuthzipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class MicroservicesCloudSleuthZipkinApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicesCloudSleuthZipkinApplication.class, args);
    }

}
