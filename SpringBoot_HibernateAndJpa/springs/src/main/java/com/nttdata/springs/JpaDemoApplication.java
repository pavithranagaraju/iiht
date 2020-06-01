package com.nttdata.springs;


import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.springs.entity.Person;
import com.nttdata.springs.jdbc.PersonJdbcDao;
//import com.nttdata.springs.jpa.Personjpa;
import com.nttdata.springs.jpa.Personjpa;

@SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner {

	
	private Logger logger=LoggerFactory.getLogger(this.getClass());
	@Autowired
	Personjpa repository;
	
	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	//logger.info("all users ->{}",dao.findAll());
	logger.info("user id 10001 ->{}",repository.findById(10001));
//	logger.info("user id 10002 ->no of rows deleted -{}",dao.deleteById(10002));
	logger.info("Inserting -> {}", 
			repository.insert(new Person("Tara", "Berlin", new Date())));
logger.info("update 10003 ->{}",
		repository.update(new Person(10003, "Peter","Utrechet", new Date())));
repository.deleteById(10002);
logger.info("All users -> {}", repository.findAll());
	}

}
