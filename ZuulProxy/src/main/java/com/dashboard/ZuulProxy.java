package com.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
@EnableEurekaClient
public class ZuulProxy {
    public static void main(String[] args) {
        SpringApplication.run(ZuulProxy.class, args);
        System.out.println("\n============= Starting Zuul Proxy please wait ============= \n ");
        System.out.println("\n============= ZuulProxy status is  UP ============= \n ");
    }
}
