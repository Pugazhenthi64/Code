package com.te.adding;

import java.util.Comparator;

public class EmpId  implements Comparator<Employe>{

	@Override
	public int compare(Employe o1, Employe o2) {
		// TODO Auto-generated method stub
		return o1.id-o2.id;
	}
	

}
