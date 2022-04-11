package com.example.demo.ws.endpoints.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DemoEndpoint {
	
	private RestTemplate template;
	
	@RequestMapping("/")
	public String hello() {
		return "hello World!!";
	
	}
	
	@RequestMapping("/other")
	public String other() {
		return "other is working!";
	}
	
	public DemoEndpoint(RestTemplate template) {
		this.template = template;
		
	}
	
	@RequestMapping("/template")
	public String hello1() {
		String message = this.template.getForObject("http://localhost:8090", String.class);
		return message;
	}
	
	

}
