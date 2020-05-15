package com.bluroc.cloud.microservicesconsumerfeign.interf;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//import org.springframework.cloud.openfeign.FeignClient;

/**
 * 功能描述: <br>
         测试从服务提供者获取的服务
 */

@FeignClient(name="service-provider")
public interface TestFeignClient {
    @RequestMapping(value = "/test/{id}",method = RequestMethod.GET)
    public String test(@PathVariable("id") String id);
}