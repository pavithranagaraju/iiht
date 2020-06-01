package com.nttdata.springboots;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootsApplication {

	public static void main(String[] args) {
		 ApplicationContext ctx = 	SpringApplication.run(SpringbootsApplication.class, args);
	
	for(String name:ctx.getBeanDefinitionNames()){
		System.out.println(name);
	}
	
	}

}
