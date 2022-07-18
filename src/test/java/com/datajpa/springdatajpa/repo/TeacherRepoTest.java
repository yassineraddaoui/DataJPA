package com.datajpa.springdatajpa.repo;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.datajpa.springdatajpa.entitie.Course;
import com.datajpa.springdatajpa.entitie.CourseMateriel;
import com.datajpa.springdatajpa.entitie.Teacher;
@SpringBootTest
class TeacherRepoTest {
	@Autowired
	private TeacherRepo teacherRepo;

	@Test
	public void saveTeacher() {

		Course course1 =Course.builder()
				.title("course1")
				.credit(3)			
				.build();
		Course course2 =Course.builder()
				.title("course2")
				.credit(3)			
				.build();
		
		Teacher teacher =Teacher.builder()
				.firstname("ys")
				.lastname("rad")
				//.listCourse(List.of(course1,course2))
				.build();
		teacherRepo.save(teacher);
	}

}
