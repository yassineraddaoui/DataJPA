package com.datajpa.springdatajpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.datajpa.springdatajpa.entitie.Course;
@Repository

public interface CourseRepo extends JpaRepository<Course, Long> {

}
