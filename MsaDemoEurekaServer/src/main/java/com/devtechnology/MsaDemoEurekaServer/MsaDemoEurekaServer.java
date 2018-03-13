package com.devtechnology.MsaDemoEurekaServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;



@EnableEurekaServer
@SpringBootApplication
public class MsaDemoEurekaServer {

	public static void main(String[] args) {
		SpringApplication.run(MsaDemoEurekaServer.class, args);
	}
}
