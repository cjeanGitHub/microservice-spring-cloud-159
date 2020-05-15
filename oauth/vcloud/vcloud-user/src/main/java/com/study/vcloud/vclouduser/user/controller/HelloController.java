package com.study.vcloud.vclouduser.user.controller;

import com.study.vcloud.vcloudcommon.bean.UserVO;
import com.study.vcloud.vclouduser.user.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class HelloController {

    @GetMapping("/hello")
    public String getHello(UserVO userVO){
        System.out.println("用户id:"+userVO.getUserId());
        return "user/hello";
    }

    @GetMapping("/hello2")
    public String getHello2(){
        return "user/hello";
    }

}