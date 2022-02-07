package com.nagarro.docker.client;

import java.util.List;

//import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


//@FeignClient(url="https://localhost:8086/user",name = "USER-CLIENT")
public interface Feignclient {
	public String getName();
		
	}

