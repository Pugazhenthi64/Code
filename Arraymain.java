package com.te.adding;

public class Arraymain {

	public static void main(String[] args) {
		
		ArrayListData arrayListData = new ArrayListData(10);
		
		arrayListData.add(20);
		arrayListData.add("data");
		arrayListData.add(1.0);
		
		System.out.println(arrayListData.empty());
		System.out.println(arrayListData.toString());
		
		
		for(Object kkt : arrayListData) {
			
			System.out.println(kkt);
		}
		
//		
//		for (int i = 0 ; i < arrayListData.size(); i++) {
//			System.out.println(arrayListData.get(i));
//		}

		

	}

}
