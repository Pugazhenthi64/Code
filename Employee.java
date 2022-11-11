package com.te.adding;

public class Employee  implements Comparable{

	int empId;
	String empName;
	
	public Employee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}

	public int compareTo(Object o) {
		
		return (this.empId-o.empId);
	}
	

}
