package com.datajpa.springdatajpa.repo;

import java.util.List;
import java.util.Optional;

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
				.firstName("yassin")
				.guardian(guardian)
				.build();
		
		studentRepository.save(student);
	}
	@Test
	public void printAllStudent() {
		List<Student> st= studentRepository.findAll();
		System.out.println(st);
	}
	@Test
	public void findByFirstNameContainingIgnoreCase() {
		List<Student> st= studentRepository.findByFirstNameContainingIgnoreCase("yAS");
		System.out.println("findByFirstNameContainingIgnoreCase\n"+st);
	}
//	@Test
//	public void findbyFirstName() {
//		List<Student> st= studentRepository.findByFirstName("yassin");
//		System.out.println("findbyFirstName\n"+st);
//	}
	@Test
	public void findbyFirstNameContaining() {
		List<Student> stc= studentRepository.findByFirstNameContaining("yAs");
		System.out.println("findbyFirstNameContaining\n"+stc);
	}
//	@Test
//	public void findByLastNameNotNull() {
//		List<Student> stc= studentRepository.findByLastNameNotNull();
//		System.out.println("findByLastNameNotNull\n"+stc);
//	}
//	@Test
//	public void findByGuardianName() {
//		List<Student> stc= studentRepository.findByGuardianName("yassin");
//		System.out.println("findByGuardianName \n"+stc);
//	}
//	
}
