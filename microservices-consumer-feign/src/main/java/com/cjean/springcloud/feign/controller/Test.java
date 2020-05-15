package com.cjean.springcloud.feign.controller;

import com.cjean.springcloud.feign.interf.TestFeignClient;
import com.cjean.springcloud.feign.interf.TestFeignClient01;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Test {
    @Autowired
    TestFeignClient testFeignClient;
    @Autowired
    TestFeignClient01 testFeignClient01;

    @GetMapping("/testFeignUseProvider/{id}")
    public String testFeignUserProvider(@PathVariable String id){
        return testFeignClient.test(id+":   FeignClient");
    }

    @GetMapping("/testFeignUseRibbon/{id}")
    public String testFeignUseRibbon(@PathVariable String id){
        return testFeignClient01.test(id+":   FeignClient");
    }
}