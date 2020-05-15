package com.bluroc.cloud.microservicescloudsleuthzipkinhi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
public class MonckeyController {
    private static final Logger LOG = Logger.getLogger(MonckeyController.class.getName());

    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @RequestMapping("/serverhi")
    public String callHome() {
        LOG.log(Level.INFO, "calling trace service-hi  ");
        return restTemplate.getForObject("http://localhost:8072/miyahi", String.class);
    }

    @RequestMapping("/serverinfo")
    public String info() {
        LOG.log(Level.INFO, "calling trace service-hi ");
        return "i am service-hi";
    }

    @RequestMapping("/test")
    public String test() {
        return "i231241241241i";
    }

    @Bean
    public AlwaysSampler defaultSampler() {
        return new AlwaysSampler();
    }
}
