package com.pzhu.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author Guo Huaijian
 * @Date 2020/3/15 21:11
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SpringBootAdminClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootAdminClientApplication.class, args);
    }
}
