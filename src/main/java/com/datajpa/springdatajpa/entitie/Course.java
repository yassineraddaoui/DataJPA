package com.datajpa.springdatajpa.entitie;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Course {
	@Id
	@SequenceGenerator(	
			name = "course_sequence",
			sequenceName = "course_sequence",	
			allocationSize = 1)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "course_sequence")
	private Long courseId;
	private String title;
	private Integer credit;
	@OneToOne(
			cascade = CascadeType.ALL,
			mappedBy = "course"
			)
	//Uni & Bidirectional RS
	private CourseMateriel courseMateriel;
	@ManyToOne(
			cascade = CascadeType.ALL
			,optional = false)
	@JoinColumn(
			name = "teacher_id" ,
			referencedColumnName = "teacherId")
	private Teacher teacher;

}
