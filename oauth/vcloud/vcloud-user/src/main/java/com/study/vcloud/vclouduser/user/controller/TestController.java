package com.study.vcloud.vclouduser.user.controller;

import com.study.vcloud.vclouduser.user.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@RequestMapping("/Test")
public class TestController {

    @Autowired
    private SysUserService sysUserService;

    @GetMapping("/getUserById/{id}")
    public String getUser(@PathVariable Integer id){
        return sysUserService.selectById(id).toString();
    }
}