package com.te.hipernetuniversity.module;

import java.util.List;

import javax.annotation.processing.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="student_details")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String subject;
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "student")
	private CourseDoing courseDoing;
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "student1")
	private List<BookTaken> bookTaken4;
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Sports> sports1;
}
