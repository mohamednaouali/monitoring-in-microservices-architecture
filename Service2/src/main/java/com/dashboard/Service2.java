package com.dashboard;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@EnableDiscoveryClient
public class Service2 {

    public static void main(String[] args) {
        SpringApplication.run(Service2.class, args);
        System.out.println("************************************  Starting 1 Service  please wait  ************************************");
        System.out.println("************************************  Service 1 is UP  ************************************");
    }
}
