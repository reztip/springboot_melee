package com.melee.webapp.meleewebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
@ComponentScan(basePackages =  "com.melee.webapp.meleewebapp")
public class IndexController {
	
	@RequestMapping(value = "/index")
	String home() {
		return "index";
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(IndexController.class, args);
	}
	
	

}
