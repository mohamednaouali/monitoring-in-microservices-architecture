package com.dashboard.eureka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 *
 */
@Component
public class EurekaMetadataProvider {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${eureka.url}")
    private String eureka;

    public String getMetaDataFromEureka(){

        System.out.println("\n============= Collecting eureka clients metadata from eureka ============= \n ");
        String metadata=restTemplate.getForObject(eureka,String.class);
        System.out.println(metadata);
        System.out.println("\n=============  Collecting is donne end looking  ============= \n");

        return metadata;
    }
}
