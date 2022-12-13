package com.example.demo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebdemoApplication implements InitializingBean{

	public static void main(String[] args) {
		SpringApplication.run(WebdemoApplication.class, args);
	}

	@PostConstruct
	public void test22() {
		System.out.println("어느시점인지 보자 @PostConstruct");
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		
		System.out.println("어느시점인지 보자 @afterPropertiesSet");
	}

}
