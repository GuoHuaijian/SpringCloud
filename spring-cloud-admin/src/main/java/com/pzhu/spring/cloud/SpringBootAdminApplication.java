package com.pzhu.spring.cloud;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * SpringBootAdmin监控
 * @Author Guo Huaijian
 * @Date 2020/3/15 21:02
 */
@SpringBootApplication
@EnableEurekaClient
@EnableAdminServer
public class SpringBootAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootAdminApplication.class, args);
    }
}
