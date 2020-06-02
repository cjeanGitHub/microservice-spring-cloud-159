package com.study.vcloud.vcloudeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableEurekaServer
@SpringBootApplication
public class VcloudEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(VcloudEurekaApplication.class, args);
    }
    /**
     * 必须关闭csrf 不然client注册不上
     * @Date 22:01 2019/7/12
     **/
    @EnableWebSecurity
    public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
        @Override
        protected void configure(HttpSecurity http) throws Exception {
            // 禁止跨站访问
            http.csrf().disable().httpBasic();
            super.configure(http);
        }
    }

}
