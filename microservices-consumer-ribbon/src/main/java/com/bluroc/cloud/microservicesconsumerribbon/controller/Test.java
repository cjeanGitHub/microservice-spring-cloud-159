package com.bluroc.cloud.microservicesconsumerribbon.controller;

import com.bluroc.cloud.microservicesconsumerribbon.interf.impl.RibbonConsumerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class Test {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private RibbonConsumerServiceImpl ribbonConsumerServiceImpl;

    @GetMapping("/testRibbonUseProvider/{id}")
    public String test(@PathVariable String id){
        return this.restTemplate.getForObject("http://service-provider/test/"+id+":  ribbon",String.class);
    }
    @GetMapping("/methodOfribbon/{id}")
    public String ribbonTest(@PathVariable String id){
        return "ribbon:hello"+id.toString();
    }

    @GetMapping("/testRibbonUseFeign/{id}")
    public String feignTest(@PathVariable String id){
        return this.restTemplate.getForObject("http://client-feign/testFeignUseProvider/"+id+":  ribbon",String.class);
    }

    @RequestMapping("/consumer")
    public String client()
    {
        return ribbonConsumerServiceImpl.client();
    }



}