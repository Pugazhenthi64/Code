package com.te.hipernetuniversity.module;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name = "book_given")
public class BookTaken {
	
	private String author;
	@Id
	private int bookNo;
	private String type;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Student student1;
	

}
