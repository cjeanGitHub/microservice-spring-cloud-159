package com.study.vcloud.vcloudoauth.oauth.controller;

import com.study.vcloud.vcloudoauth.oauth.bean.UserVo;
import com.study.vcloud.vcloudoauth.oauth.controller.service.HelloService;
import com.study.vcloud.vcloudoauth.oauth.feign.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/hello")
    public String getHello(){
        return "oauth/hello";
    }

    @GetMapping("/getFeignHello")
    public String getFeignHello(){
        return helloService.getHello();
    }

}