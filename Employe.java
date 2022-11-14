package com.te.adding;

import java.util.Objects;

public class Employe {

	int id;
	String name;
	int aadhar;
	public int EmpId;
	public String employeName;
	public int empAadhar;

	public Employe(int id, String name, int aadhar) {
		super();
		this.id = id;
		this.name = name;
		this.aadhar = aadhar;
	}

	@Override
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + ", aadhar=" + aadhar + "]";
	}

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + aadhar;
//		result = prime * result + id;
//		return result;
//	}
	

	@Override
	public int hashCode() {
		
		return Objects.hash(this.id);
	}
	
	

	@Override
	public boolean equals(Object obj) {
		
		Employe other = (Employe) obj;

		if ((id != other.id))
			return false;
		return true;
	}


//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Employe other = (Employe) obj;
//		if (aadhar != other.aadhar)
//			return false;
//		if (id != other.id)
//			return false;
//		return true;
//	}

//	@Override
//	public int hashCode() {
//		return Objects.hash(this.id,this.aadhar);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		Employe other = (Employe) obj;
//		if (id != other.id) {
//			return false;
//		}
////		if(id==other.id) {
////			System.out.println("Error");
////			
////		}
//		return true;
//	}

	
}
