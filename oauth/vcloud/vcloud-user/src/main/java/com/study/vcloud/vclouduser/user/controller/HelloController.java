package com.study.vcloud.vclouduser.user.controller;

import com.study.vcloud.vclouduser.user.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class HelloController {

    @GetMapping("/hello")
    public String getHello(){
        return "user/hello";
    }

}