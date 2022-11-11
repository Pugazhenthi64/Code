package com.te.adding;

import java.util.Comparator;

public class StudentLocationD implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o2.studentLocation.compareTo(o1.studentLocation);
	}

	
}
