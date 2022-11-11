package com.te.adding;

public class Student {

	int studentId;
	String studentName;
	int studentAge;
	int studentMark;
	String studentLocation;

	

	public Student(int studentId, String studentName, int studentAge, int studentMark, String studentLocation) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.studentMark = studentMark;
		this.studentLocation = studentLocation;
	}



	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge
				+ ", studentMark=" + studentMark + ", studentLocation=" + studentLocation +"]";
	}
	
	
	
	
}
