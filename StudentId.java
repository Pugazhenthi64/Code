package com.te.adding;

import java.util.Comparator;

public class StudentId implements Comparator<Student>{

	
	public int compare(Student o1, Student o2) {
		return o1.studentId-o2.studentId;
	}
	

	
}
