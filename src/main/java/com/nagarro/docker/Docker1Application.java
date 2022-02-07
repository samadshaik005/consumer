package com.nagarro.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
//@EnableFeignClients
public class Docker1Application {

	public static void main(String[] args) {
		SpringApplication.run(Docker1Application.class, args);
	}
	@Bean
	public RestTemplate getResttemplate() {
		return new RestTemplate();
	}

}
