package com.example.gatewayserver;

import org.springframework.cloud.client.discovery.ReactiveDiscoveryClient;
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator;
import org.springframework.cloud.gateway.discovery.DiscoveryLocatorProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RouteConfig {
    /*@Bean
    public RouteLocator routeDefinition(RouteLocatorBuilder builder){
        return builder.routes()
                .route(r-> r.path("/api/v1/customers/**").uri("lb://CUSTOMER-SERVICE"))
                .route(r-> r.path("/api/v1/fraud-check/**").uri("lb://FRAUD-SERVICE"))
                .build();
    }*/
    @Bean
    public DiscoveryClientRouteDefinitionLocator discoveryClientRouteDefinitionLocator(ReactiveDiscoveryClient rdc,
            DiscoveryLocatorProperties dlp){
        return new DiscoveryClientRouteDefinitionLocator(rdc,dlp);
    }
}
