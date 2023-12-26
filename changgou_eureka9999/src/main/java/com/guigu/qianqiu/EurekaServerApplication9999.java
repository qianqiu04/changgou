package com.guigu.qianqiu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication9999 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication9999.class, args);
    }
}
