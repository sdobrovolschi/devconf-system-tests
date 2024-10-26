package com.example.service;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootApplication
class Config {

    @Bean
    WebTestClient webTestClient() {
        return WebTestClient.bindToServer()
                .baseUrl("https://spring.io")
                .build();
    }
}
