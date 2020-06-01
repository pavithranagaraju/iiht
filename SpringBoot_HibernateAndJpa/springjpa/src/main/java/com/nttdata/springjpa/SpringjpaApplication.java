package com.nttdata.springjpa;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.springjpa.entity.Course;
import com.nttdata.springjpa.entity.FullTimeEmployee;
import com.nttdata.springjpa.entity.PartTimeEmployee;
import com.nttdata.springjpa.entity.Review;
import com.nttdata.springjpa.entity.Student;
import com.nttdata.springjpa.repository.CourseRepository;
import com.nttdata.springjpa.repository.EmployeeRepository;
import com.nttdata.springjpa.repository.StudentRepository;

@SpringBootApplication
public class SpringjpaApplication implements CommandLineRunner{

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private CourseRepository courserepository;
	@Autowired
	private StudentRepository studentrepository;
	@Autowired
	private EmployeeRepository employeerepository;
		public static void main(String[] args) {
			SpringApplication.run(SpringjpaApplication.class, args);
		}
		@Override
		public void run(String... args) throws Exception {
			// TODO Auto-generated method stub
			/*Course course = repository.findById(10001L);
			
			logger.info("Course 10001 -> {}", course);
			repository.deleteById(10001L);
			repository.save(new Course("nandamma"));
			repository.playWithEntityManager();*/
			//studentrepository.saveStudentwithPassport();
			//courserepository.hardcodeReviewsForCourse();
			/*List<Review> reviews = new ArrayList<>();
			
			reviews.add(new Review("5", "Great Hands-on Stuff."));	
			reviews.add(new Review("5", "Hatsoff."));

			courserepository.addReviewsForCourse(10003L, reviews );
			*/
			//studentRepository.insertHardcodedStudentAndCourse();
			//studentrepository.insertStudentAndCourse(new Student("Jack"), 
				//	new Course("Microservices in 100 Steps"));
			
			
		/*	employeerepository.insert(new FullTimeEmployee("Jack",new BigDecimal("1000")));
		
			employeerepository.insert(new PartTimeEmployee("Jill",new BigDecimal("50")));
			logger.info("all PartTimeemployees ->{}",employeerepository.retrieveAllPartTimeEmployees());
			logger.info("all FullTimeemployees ->{}",employeerepository.retrieveAllFullTimeEmployees());*/
		}
		

		
	}


