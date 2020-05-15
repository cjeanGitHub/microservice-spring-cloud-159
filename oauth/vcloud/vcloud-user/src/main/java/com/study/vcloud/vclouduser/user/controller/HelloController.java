package com.study.vcloud.vclouduser.user.controller;

import com.study.vcloud.vcloudcommon.bean.UserVO;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;


@RestController
public class HelloController {

    @GetMapping("/hello")
    public String getHello(UserVO userVO){
        System.out.println("/hello   getHello(UserVO userVO)"+ Objects.toString(userVO));
        System.out.println("用户id:"+userVO.getUserId());
        return "user/hello";
    }

    @GetMapping("/hello2")
    public String getHello2(){
        return "user/hello";
    }

}