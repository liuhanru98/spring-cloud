package com.cloud.cloudproviderhystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
//对hystrix熔断机制的支持
@EnableCircuitBreaker
public class CloudProviderHystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudProviderHystrixApplication.class, args);
    }

}
