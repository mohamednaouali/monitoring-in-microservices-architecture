package com.dashboard;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@EnableDiscoveryClient
public class Service1 {
    public static void main(String[] args) {
        SpringApplication.run(Service1.class, args);
        System.out.println("\n============= Starting  Service 1  please wait ============= \n ");
        System.out.println("\n============= Service 1 is UP ============= \n ");
    }

}
