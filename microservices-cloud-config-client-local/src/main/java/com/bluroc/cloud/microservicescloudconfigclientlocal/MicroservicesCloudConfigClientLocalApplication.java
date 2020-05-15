package com.bluroc.cloud.microservicescloudconfigclientlocal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MicroservicesCloudConfigClientLocalApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicesCloudConfigClientLocalApplication.class, args);
        System.out.println("本地配置文件客户端启动。。。");
    }

}
