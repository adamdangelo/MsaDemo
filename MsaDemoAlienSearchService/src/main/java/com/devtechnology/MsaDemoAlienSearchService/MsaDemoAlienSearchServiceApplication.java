package com.devtechnology.MsaDemoAlienSearchService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MsaDemoAlienSearchServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsaDemoAlienSearchServiceApplication.class, args);
	}
}
