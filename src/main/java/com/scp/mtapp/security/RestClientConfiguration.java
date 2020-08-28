package com.scp.mtapp.security;

import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

public class RestClientConfiguration {

    @Bean
    RestTemplate myRestTemplate() {
        return new RestTemplate();
    }

    @Bean
    RestTemplate xsuaaRestOperations() {
        return new RestTemplate();
    }
}