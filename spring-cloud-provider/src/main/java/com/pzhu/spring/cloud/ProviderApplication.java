package com.pzhu.spring.cloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * eureka服务客户端
 * @Author Guo Huaijian
 * @Date 2020/3/15 14:56
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.pzhu.spring.cloud.dao")
public class ProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class,args);
    }
}
