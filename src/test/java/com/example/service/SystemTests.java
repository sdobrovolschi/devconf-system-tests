package com.example.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

import static org.springframework.http.MediaType.TEXT_HTML;

@SpringBootTest
@AutoConfigureWebTestClient
class SystemTests {

	@Autowired
	WebTestClient client;

	@Test
	void pageLoad() {
		client.get().uri("/projects/spring-boot/")
				.accept(TEXT_HTML)
				.exchange()
				.expectStatus().isOk();
	}

}
