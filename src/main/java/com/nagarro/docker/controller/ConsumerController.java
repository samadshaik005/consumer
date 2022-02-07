package com.nagarro.docker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {
	
	String url="http://localhost:8080/user/name";
	@Autowired
	private RestTemplate resttemplate;

	@GetMapping("/name")
	public String homepage() {
		return "my name samad1(consumer)";

	}
	@GetMapping("/getname")
	public String getName() {
		String name = this.resttemplate.getForObject(url,String.class);
		return name;

	}
}
