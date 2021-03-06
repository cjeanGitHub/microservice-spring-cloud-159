package com.bluroc.cloud.microservicesconsumerfeign.interf;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//import org.springframework.cloud.openfeign.FeignClient;

/**
 * 功能描述: <br>
         测试从ribbon获取的服务
 */

@FeignClient(name="eureka-ribbon", fallback = TestFeignClientFallbackFromRibbonHystrix.class)
public interface TestFeignClientFromRibbon {
    @RequestMapping(value = "/methodOfribbon/{id}",method = RequestMethod.GET)
    public String test(@PathVariable("id") String id);
}

@Component
class TestFeignClientFallbackFromRibbonHystrix implements TestFeignClientFromRibbon {
    @Override
    public String test(@PathVariable("id") String id) {
        return "TestFeignClientFallbackFromRibbonHystrix>methodOfribbon>"+id;
    }
}