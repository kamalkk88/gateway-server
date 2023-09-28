package com.hotel.gatewayserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GatewayServerApplication {

    public static void main(String[] args) {

        new SpringApplicationBuilder()
                .profiles("dev").sources(GatewayServerApplication.class)
                .run(args);
    }

}
