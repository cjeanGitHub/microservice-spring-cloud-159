package com.cjean.springcloud.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class Test {
    @Autowired
    private RestTemplate restTemplate;

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
        return this.restTemplate.getForObject("http://client-feign/test/"+id+":  ribbon",String.class);
    }
}