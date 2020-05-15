package com.study.vcloud.vcloudoauth.oauth.controller;

import com.study.vcloud.vcloudoauth.oauth.bean.UserVo;
import com.study.vcloud.vcloudoauth.oauth.controller.service.HelloService;
import com.study.vcloud.vcloudoauth.oauth.feign.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/Test")
public class TestController {
    @Autowired
    private UserService userService;

    @GetMapping("/getOauthInfoForRedis")
    public UserVo getOauthInfoForRedis(){
        return userService.getUserByUsername("hello");
    }
}