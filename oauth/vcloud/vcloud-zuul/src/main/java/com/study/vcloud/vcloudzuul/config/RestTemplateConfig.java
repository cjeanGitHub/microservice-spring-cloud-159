package com.study.vcloud.vcloudzuul.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author lengleng
 * @date 2019/2/1
 * RestTemplate
 */
@Configuration
public class RestTemplateConfig {
	@Bean
	public RestTemplate restTemplate() {
		//httpRequestFactory()
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.setErrorHandler(new ExceptionHandler());
		return restTemplate;
	}
}