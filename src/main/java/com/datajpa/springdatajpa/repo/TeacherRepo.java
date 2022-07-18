package com.datajpa.springdatajpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.datajpa.springdatajpa.entitie.Teacher;
@Repository
public interface TeacherRepo extends JpaRepository<Teacher, Long> {

}
