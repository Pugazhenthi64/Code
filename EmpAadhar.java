package com.te.adding;

import java.util.Comparator;

public class EmpAadhar implements Comparator<Employe> {

	@Override
	public int compare(Employe o1, Employe o2) {
		// TODO Auto-generated method stub
		return o1.aadhar-o2.aadhar;
	}

	

}
