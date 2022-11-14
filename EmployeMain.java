package com.te.adding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class EmployeMain {

	static Employe employe ;
	static HashSet<Employe> hashSet;
	static boolean req=true;
	int no = 0;
	String name="";
	int adh=0;
	ArrayList arrayList = new ArrayList();


	static Scanner scanner = new Scanner(System.in);
	static void addingData() {
		//		char yes=scanner.nextLine().charAt(0);

	}
	//	static void adding() {
	//		System.out.println("Enter id");
	//		int no=scanner.nextInt();
	//
	//		System.out.println("Enter name");
	//		String name=scanner.next();
	//
	//		System.out.println("Enter Aadhaar");
	//
	//		int adh=scanner.nextInt() ;
	//
	//
	////		employe = new Employe(no,name,adh);
	//
	//		 hashSet = new HashSet<Employe>();
	//		hashSet.add(new Employe(no,name,adh));
	//		System.out.println("Do you want to add more Employe");
	//		
	//		arrayList = new ArrayList<Employe>(hashSet);
	////		for (Employe employe : arrayList) {
	////			System.out.println(employe);
	////			
	////		}
	//
	//		addingData();
	//		
	//		
	//	}


	void adding() {
		while(req) {
			System.out.println("Enter id");

			if(scanner.hasNextInt()) {
				no=scanner.nextInt();}
			else {
				System.out.println("Enter the valid data");
				adding();
			}
			System.out.println("Enter name");
			name=scanner.next();
			System.out.println("Enter Aadhaar");
			if(scanner.hasNextInt()) {
				adh=scanner.nextInt();}
			else {
				System.out.println("Enter the valid data");
				adding();
			}
			
			hashSet.add(new Employe(no,name,adh));
			nextSeq();
		}
		
		}
	void nextSeq() {
		System.out.println("Do you want to add more Employe");

		String yes=scanner.next();
		String notDone="yes";
		String done="no";
		String sample="y";
		String sample1="n";

		if(yes.equalsIgnoreCase(notDone)||yes.equalsIgnoreCase(sample)) {

		} else if(yes.equalsIgnoreCase(done)|| yes.equalsIgnoreCase(sample1)) {
			arrayList.addAll(hashSet);
			System.out.println("Employee details");
			req=false;
			sortOn();
			
		} else {
			System.out.println("Please enter the valid input\n Either press Yes or No");
			nextSeq();
		}
	}
	void sortOn() {
		System.out.println("Enter the type that you want to sort");
		System.out.println("1) Id. \n 2) name. \n 3) Aadhaar");
		int selection=0 ;
		if(scanner.hasNextInt()) { 
		selection=scanner.nextInt();
		
		switch(selection) {
		case 1:
			System.out.println("Based on Id");
			Collections.sort(arrayList, new EmpId());
			for(Object object: arrayList) {
				System.out.println(arrayList);
				break;
			}
			break;
		case 2:
			System.out.println("Based on Name");
			Collections.sort(arrayList, new EmpName());
			for(Object object: arrayList) {
				System.out.println(arrayList);
				break;
			}
			break;
		case 3:
			System.out.println("Based on Aadhaar");
			Collections.sort(arrayList, new EmpAadhar());
			for(Object object: arrayList) {
				System.out.println(arrayList);
				break;
			}
			break;
			default:
				System.out.println("Enter the valid no only");
				sortOn();
		}
		} else {
			System.out.println("Only numbers are allowed");
			sortOn();
		}
		System.out.println("Do you want to see more details /t /t press Yes or Press NO");
		String finOutput;
		String yes="Yes";
		String no="No";
		finOutput=scanner.next();
		if(finOutput.equalsIgnoreCase(yes)) {
			sortOn();
		} else if(finOutput.equalsIgnoreCase(no)) {
			System.out.println("Your data has been saved... ");
		} else {
			System.out.println("Enter the valid input /t Press Yes or No");
			sortOn();
		}
		
	}
		public static void main(String[] args) {

			
			hashSet = new HashSet<Employe>();
			System.out.println("Welcome to Employe DataBase");
			System.out.println("Please enter the Employee Details");
			EmployeMain employeMain=new EmployeMain();
			employeMain.adding();
			//		EmployeMain employeMain = new EmployeMain();
			//			for(Object object: hashSet) {
			//				System.out.println(object);
			//			}
			
		


		//		adding();
		//		 Employe employe = new Employe(1, "kk", 22);
		//		 Employe employe2 = new Employe(2, "aa", 9);
		//		 Employe employe3 = new Employe(1, "jj", 5);
		//		 Employe employe4=new Employe(4, "zz", 22);

		//		 HashSet<Employe> hashSet = new HashSet<Employe>();
		//		 hashSet.add(employe);
		//		 hashSet.add(employe2);
		//		 hashSet.add(employe3);
		//		 hashSet.add(employe4);

		//		 for(Object object:hashSet) {
		//			 System.out.println(object);
		//			 
		//		 }
		//		 
		

	}

}
