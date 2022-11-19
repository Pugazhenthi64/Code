package com.te.hipernetuniversity.module;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "course_going")
@Data
public class CourseDoing {
	
	private String duration;
	private String attend;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int rollNo;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Student student;
	

}
