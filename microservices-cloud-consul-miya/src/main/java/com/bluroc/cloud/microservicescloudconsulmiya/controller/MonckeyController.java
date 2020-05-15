package com.bluroc.cloud.microservicescloudconsulmiya.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MonckeyController {

    @RequestMapping("/hi")
    public String home() {
        return "hi ,i am miya";
    }

}
