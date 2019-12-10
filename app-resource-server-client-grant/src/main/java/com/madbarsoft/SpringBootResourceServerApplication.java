package com.madbarsoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@EnableResourceServer
@SpringBootApplication
public class SpringBootResourceServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootResourceServerApplication.class, args);
	}

}
