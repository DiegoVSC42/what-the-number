package diegoVSC42.what_the_number;

import diegoVSC42.what_the_number.service.BasicNumPropertiesService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WhatTheNumberApplication{
	public static void main(String[] args){
		SpringApplication.run(WhatTheNumberApplication.class, args);
		BasicNumPropertiesService bnp = new BasicNumPropertiesService();
	}
}
