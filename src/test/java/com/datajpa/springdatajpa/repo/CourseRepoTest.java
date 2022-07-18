package com.datajpa.springdatajpa.repo;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.datajpa.springdatajpa.entitie.Course;
import com.datajpa.springdatajpa.entitie.CourseMateriel;
import com.datajpa.springdatajpa.entitie.Teacher;
@SpringBootTest
class CourseRepoTest {
	@Autowired
	private CourseRepo courseRepo;
	@Autowired
	private CourseMatRepo courseMatRepo;

	@Test
	public void saveCourse() {
		Course course =Course.builder()
				.title("course1")
				.credit(3)			
				.build();
		courseRepo.save(course);
	}
	
	@Test
	public void printAllCourse() {
		Course course =Course.builder()
				.title("course1")
				.credit(3)			
				.build();
		CourseMateriel courseMateriel =CourseMateriel.builder()
				.course(course)
				.url("xxw.wx")
				.build();
		courseMatRepo.save(courseMateriel);

		List<Course> courseList= courseRepo.findAll();
		
		System.out.println(courseList);
	}
	@Test
	public void saveCourseWidT() {
		

		Teacher teacher=Teacher.builder()
				.firstname("yass")
				.lastname("radad")
				.build();
		Course course =Course.builder()
				.teacher(teacher)
				.title("cours1")
				.credit(2)
				.build();
		CourseMateriel courseMateriel =CourseMateriel.builder()
				.url("xxw.wx")
				.course(course)
				.build();
		courseMatRepo.save(courseMateriel);

	}
}
