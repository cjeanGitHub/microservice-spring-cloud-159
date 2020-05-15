package com.bluroc.cloud.microservicescloudconfigserverlocal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class MicroservicesCloudConfigServerLocalApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicesCloudConfigServerLocalApplication.class, args);
    }

}
