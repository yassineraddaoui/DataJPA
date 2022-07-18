package com.datajpa.springdatajpa.repo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.datajpa.springdatajpa.entitie.Course;
import com.datajpa.springdatajpa.entitie.CourseMateriel;

@SpringBootTest

public class CourseMatRepoTest {
	@Autowired
	private CourseMatRepo courseMatRepo;
	//cascading means passing the permission to the child element ===> to classMat here
//	CASCADE in MySQL helps to update/delete the entry from the parent as well as child table simultaneously.
//	ON UPDATE CASCADE and ON DELETE CASCADE is written while creating the child table.
//	CASCADE helps in reducing the human effort in updating or deleting an entry from the database.

	@Test
	public void saveCourse() {
		Course course =Course.builder()
				.title("course1")
				.credit(3)				
				.build();
		
		CourseMateriel courseMat =CourseMateriel.builder()
				.url("www.xw.com")
				.course(course)
				.build();
		courseMatRepo.save(courseMat);
	}
	@Test
	public void printAllCourseMat() {
		System.out.println(courseMatRepo.findAll());
	}

}
