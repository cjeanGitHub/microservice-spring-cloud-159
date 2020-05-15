package com.dalaoyang.springboot2_nacos_config.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/config")
@RefreshScope
public class ConfigController {
    /**
     * 读取hengboy.name配置信息
     */
//    @Value(value = "${hengboy.name:}")
    private String userName;
    /**
     * 读取hengboy.age配置信息
     */
//    @Value(value = "${hengboy.age:}")
    private String userAge;

    /**
     * 获取配置内容
     *
     * @return
     */
    @RequestMapping(value = "/get")
    public String getConfig() {
        return userName + ":" + userAge;
    }

}