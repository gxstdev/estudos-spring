package com.spring.estudos.gerais.config;

import com.spring.estudos.gerais.controller.ClienteController;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {

    @Bean
    public RequestInterceptor requestInterceptor() {
        return new RequestInterceptor() {
            @Override
            public void apply(RequestTemplate template) {
                template.header("Authorization", "Bearer " + getJWT());
            }
        };
    }

    private String getJWT() {
        return ClienteController.token;
    }
}
