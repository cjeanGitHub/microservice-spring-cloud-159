package com.bluroc.cloud.microservicesprovider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @GetMapping("/test/{id}")
    public String test(@PathVariable String id){
        return "hello："+id.toString();
    }
}