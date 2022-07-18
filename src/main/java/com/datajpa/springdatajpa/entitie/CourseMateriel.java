package com.datajpa.springdatajpa.entitie;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@ToString(exclude ="course")
public class CourseMateriel {
	@Id
	@SequenceGenerator(
			name = "course_sequence",
			sequenceName = "course_sequence",
			allocationSize = 1)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "course_sequence")
	
	private Long courseMaterielId;
	private String url;
	//check test
	//LAZY: dont fetch course
	//EAGER: fetch all
	@OneToOne(cascade = CascadeType.ALL,
			fetch = FetchType.LAZY
			//not-null property
			)
	@JoinColumn(
			name = "course_id",
			referencedColumnName = "courseId"
			)
	private Course course;
}
