package com.mkpoutoe.rest.webservices.restful_web_services.course.springdatajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mkpoutoe.rest.webservices.restful_web_services.course.Course;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {

	List<Course> findByAuthor(String author);
	List<Course> findByName(String name);
}
