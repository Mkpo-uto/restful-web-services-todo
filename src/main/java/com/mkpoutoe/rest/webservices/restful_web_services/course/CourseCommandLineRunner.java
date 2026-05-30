package com.mkpoutoe.rest.webservices.restful_web_services.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.mkpoutoe.rest.webservices.restful_web_services.CourseJdbcRepository;
import com.mkpoutoe.rest.webservices.restful_web_services.course.springdatajpa.CourseSpringDataJpaRepository;
import com.mkpoutoe.rest.webservices.restful_web_services.jpa.CourseJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//	@Autowired
//	private CourseJdbcRepository repository;
	
//	@Autowired
//	private CourseJpaRepository repository;
	
	@Autowired
	private CourseSpringDataJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		
		repository.save(new Course(1,"Learn AWS Jpa","mkpoutoe"));
		repository.save(new Course(2,"Learn Azure Jpa","mkpoutoe"));
		repository.save(new Course(3,"Learn DevOps Jpa","mkpoutoe"));
		
		repository.deleteById(1l);
		
		System.out.println(repository.findById(2l));
		System.out.println(repository.findById(3l));
		
		System.out.println(repository.findByAuthor("mkpoutoe"));
		System.out.println(repository.findByAuthor(""));
		
		System.out.println(repository.findByName("Learn Azure Jpa"));
		System.out.println(repository.findByName("Learn AWS Jpa"));
	}

}
