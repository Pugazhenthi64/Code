package com.te.adding;

import java.util.Comparator;

public class StudentLocation implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.studentLocation.compareTo(o2.studentLocation);
	}
	

}
