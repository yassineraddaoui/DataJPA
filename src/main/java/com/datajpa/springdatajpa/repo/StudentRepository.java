package com.datajpa.springdatajpa.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.datajpa.springdatajpa.entitie.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
	List<Student> findByFirstName(String firstName);
	List <Student> findByFirstNameContaining(String name);
	List<Student> findByLastNameNotNull();
	List <Student> findByGuardianName(String name);
	List <Student> findByFirstNameContainingIgnoreCase(String name);
	}
