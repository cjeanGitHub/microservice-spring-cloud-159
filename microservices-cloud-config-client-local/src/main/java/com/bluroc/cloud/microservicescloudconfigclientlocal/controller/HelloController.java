package com.bluroc.cloud.microservicescloudconfigclientlocal.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class HelloController {

	@Value("${nickName}")
	private String nickName;

	@RequestMapping("/hello")
	public String hello() {
		return "hello " + nickName;
	}

	@Value("${word}")
	private String word;

	@RequestMapping("/word")
	public String word() {
		return "hello " + word;
	}

}
