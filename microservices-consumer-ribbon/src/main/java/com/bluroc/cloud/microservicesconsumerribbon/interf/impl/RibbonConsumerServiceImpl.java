package com.bluroc.cloud.microservicesconsumerribbon.interf.impl;

import com.bluroc.cloud.microservicesconsumerribbon.interf.RibbonConsumerService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
 
/**
 * Created by wzj on 2018/5/20.
 */
@Service
public class RibbonConsumerServiceImpl implements RibbonConsumerService
{
    /**
     * 注入
     */
    @Autowired
    private RestTemplate restTemplate;
 
    @HystrixCommand(fallbackMethod = "testllback")
    @Override
    public String client()
    {
        return restTemplate.getForObject("http://client-feign/testFeignUseProvider/"+8888+":  ribbon",String.class);
    }
 
    public String testllback()
    {
        return "Feign is not callback ,now call back myself msg:fallback";
    }
}