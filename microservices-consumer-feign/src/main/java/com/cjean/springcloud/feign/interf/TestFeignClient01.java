package com.cjean.springcloud.feign.interf;

import org.springframework.cloud.netflix.feign.FeignClient;
//import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 功能描述: <br>
         测试从ribbon获取的服务
 */

@FeignClient(name="eureka-ribbon")
public interface TestFeignClient01 {
    @RequestMapping(value = "/methodOfribbon/{id}",method = RequestMethod.GET)
    public String test(@PathVariable("id") String id);
}