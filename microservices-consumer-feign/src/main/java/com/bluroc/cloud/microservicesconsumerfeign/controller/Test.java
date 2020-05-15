package com.bluroc.cloud.microservicesconsumerfeign.controller;

import com.bluroc.cloud.microservicesconsumerfeign.interf.TestFeignClient;
import com.bluroc.cloud.microservicesconsumerfeign.interf.TestFeignClientFromRibbon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
    @Autowired
    TestFeignClient testFeignClient;
    @Autowired
    TestFeignClientFromRibbon testFeignClientFromRibbon;

    @GetMapping("/testFeignUseProvider/{id}")
    public String testFeignUserProvider(@PathVariable String id){
        return testFeignClient.test(id+":   FeignClient");
    }

    @GetMapping("/testFeignUseRibbon/{id}")
    public String testFeignUseRibbon(@PathVariable String id){
        return testFeignClientFromRibbon.test(id+":   FeignClient");
    }

}