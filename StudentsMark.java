package com.te.adding;

import java.util.Comparator;

public class StudentsMark implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.studentMark-o2.studentMark;
	}

	
}
