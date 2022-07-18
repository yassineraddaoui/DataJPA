package com.datajpa.springdatajpa.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.datajpa.springdatajpa.entitie.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
	List<Student> findByFirstName(String firstName);
	List <Student> findByFirstNameContaining(String name);
	List<Student> findByLastNameNotNull();
	List <Student> findByGuardianName(String name);
	List <Student> findByFirstNameContainingIgnoreCase(String name);
	//----------------------------------------------------------------------------
	//JPQL => based on class names not tables & columns nams
	@Query("select s.firstName from Student s where s.emailId=?1")
	String findStudentFirstNameByMailId(String mail);	
	@Query("select s from Student s where s.emailId=?1")
	Student findStudentByMailId(String mail);
	//----------------------------------------------------------------------------
	//Native Query ==>Complex Query ==> Based on DB
	@Query(
			value= "select s.first_name from tbl_student s where s.student_mail=?1",
			nativeQuery = true)
	String findStudentFirstNameByMailIdNative(String mail);	
	
	@Query(
			value= "select * from tbl_student s where s.student_mail=?1",
			nativeQuery = true)	
	Student findStudentByMailIdNative(String mail);

	@Query(
			value= "select * from tbl_student s where s.student_mail= :mail",
			nativeQuery = true)	
	Student findStudentByMailIdNativeNamedParam(
			@Param("mail") String mail
	);
	//----------------------------------------------------------------------------
	@Modifying
	@Transactional
	@Query(
			value = "update tbl_student  set first_name =:firstname where student_mail=:mail",
			nativeQuery = true
			)
	int updateStudentNameByMailId(@Param("firstname")String firstname,@Param("mail") String mail);
}
