package com.datajpa.springdatajpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.datajpa.springdatajpa.entitie.CourseMateriel;
@Repository
public interface CourseMatRepo  extends JpaRepository<CourseMateriel, Long>{

}
