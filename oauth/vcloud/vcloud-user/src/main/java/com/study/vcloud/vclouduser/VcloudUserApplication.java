package com.study.vcloud.vclouduser;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
//接口扫描
@MapperScan(basePackages = {"com.study.vcloud.vclouduser.user.mapper"})
@ComponentScan(basePackages = {"com.study.vcloud.vclouduser.user",})
public class VcloudUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(VcloudUserApplication.class, args);
    }

}

