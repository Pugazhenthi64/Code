package com.te.adding;

import java.util.Comparator;

public class StudentIdD implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {

		return o2.studentId-o1.studentId;
	}

}
