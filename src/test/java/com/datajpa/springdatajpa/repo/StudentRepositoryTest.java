package com.datajpa.springdatajpa.repo;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.datajpa.springdatajpa.entitie.Guardian;
import com.datajpa.springdatajpa.entitie.Student;
@SpringBootTest
class StudentRepositoryTest {
	@Autowired
	private StudentRepository studentRepository;

//	@Test
//	public void saveStudent() {
//		 
//		Student student=Student.builder()
//				.emailId("cdsc@d.c")
//				.lastName("qdsdqs")
//				.firstName("sqdsq")
//				.build();
//		
//		studentRepository.save(student);
//	}
	@Test
	public void saveStudent() {
		Guardian guardian =Guardian.builder()
				.email("ijdof@fd.cx")
				.mobile("6556")
				.name("yassin")
				.build();
		Student student=Student.builder()
				.emailId("cdsc@d.c")
				.lastName("qdsdqs")
				.firstName("sqdsq")
				.guardian(guardian)
				.build();
		
		studentRepository.save(student);
	}
	@Test
	public void printAllStudent() {
		List<Student> st= studentRepository.findAll();
		System.out.println(st);
	}
	
}
