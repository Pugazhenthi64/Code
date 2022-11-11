package com.te.adding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentMain {
	
	



	public static void main(String[] args) {
		StudentMain studentMain = new StudentMain();
		studentMain.sample();

		int value;
		boolean repeat=true;
		char ascending;

		Scanner scanner = new Scanner(System.in);


		Student student = new Student(5, "Abraham", 12, 96,"England");
		Student student2 = new Student(3, "John", 10, 90, "Berlin");
		Student student3 = new Student(9, "Nithish", 9, 98, "Tokyo");
		Student student4= new Student(1, "Sunil", 14, 95, "Sountafrica");
		Student student5 = new Student(6, "Naran", 12, 92, "America");

		ArrayList<Student> arrayList=new ArrayList<Student>();

		arrayList.add(student);
		arrayList.add(student2);
		arrayList.add(student3);
		arrayList.add(student4);
		arrayList.add(student5);

		for(Object object : arrayList) {
			System.out.println(object);
		}


		System.out.println("****************************");
		System.out.println("Welcome to Oxford University");
		System.out.println("****************************");

		while (repeat) {

			System.out.println("Please enter the no that you want to sort based on that");

			System.out.println("1) Id.");
			System.out.println("2) Name.");
			System.out.println("3) Age.");
			System.out.println("4) Marks.");
			System.out.println("5) Location.");

			value = scanner.nextInt();


			switch (value) {
			case 1: 
				System.out.println("you want in Ascending order or Descending order");
				System.out.println("Press 'A'- for Ascending (or) 'D' - for Descending");

				ascending=scanner.next().charAt(0);

				if(ascending=='A'|| ascending=='a' ||ascending=='D'|| ascending=='d') {
					if(ascending=='A'|| ascending=='a') {
					Collections.sort(arrayList, new StudentId());
				} else {
					Collections.sort(arrayList, new StudentIdD());
				}
				}else {
					throw new StudentException("You entered an invalid input");
				}
				for(Object object : arrayList) {
					System.out.println(object);
				}
				break;
			case 2:
				System.out.println("you want in Ascending order or Descending order");
				System.out.println("Press 'A'- for Ascending (or) 'D' - for Descending");
				ascending=scanner.next().charAt(0);

				if(ascending=='A'|| ascending=='a') {

					Collections.sort(arrayList, new StudentName());
				} else if (ascending=='D'|| ascending=='d') {
					Collections.sort(arrayList, new StudentNameD());
				} else {
					System.out.println("Enter only A (or) D");
				}

				for(Object object : arrayList) {
					System.out.println(object);
				}
				break;
			case 3:	
				System.out.println("you want in Ascending order or Descending order");
				System.out.println("Press 'A'- for Ascending (or) 'D' - for Descending");
				ascending=scanner.next().charAt(0);

				if(ascending=='A'|| ascending=='a') {
					Collections.sort(arrayList, new StudentAge());
				} else if (ascending=='D'|| ascending=='d'){
					Collections.sort(arrayList, new StudentAgeD());	
				} else {
					System.out.println("Enter only A (or) D");
				}
				for(Object object : arrayList) {
					System.out.println(object);
				}
				break;
			case 4:System.out.println("you want in Ascending order or Descending order");
			System.out.println("Press 'A'- for Ascending (or) 'D' - for Descending");
			ascending=scanner.next().charAt(0);

			if(ascending=='A'|| ascending=='a') {

				Collections.sort(arrayList, new StudentsMark());
			}else if (ascending=='D'|| ascending=='d'){
				Collections.sort(arrayList, new StudentsMarkD());
			} else {
				System.out.println("Enter only A (or) D");
			} 
			for(Object object : arrayList) {
				System.out.println(object);
			}
			break;
			case 5:
				System.out.println("you want in Ascending order or Descending order");
				System.out.println("Press 'A'- for Ascending (or) 'D' - for Descending");
				ascending=scanner.next().charAt(0);

				if(ascending=='A'|| ascending=='a') {
					Collections.sort(arrayList, new StudentLocation());
				} else if(ascending=='D'|| ascending=='d'){
					Collections.sort(arrayList, new StudentLocationD());
				} else {
					System.out.println("Enter only A (or) D");
				}


				for(Object object : arrayList) {
					System.out.println(object);
				}
				break;
			default: System.out.println("Enter the valid number");
			break;

			}
			System.out.println("if Continue press "+"Y"+"  (or) Exit "+"N");
			char continues = scanner.next().charAt(0);
			if(continues=='y'|| continues=='Y') {

			} else if(continues=='n'|| continues=='N') {
				repeat=false;
			} else {
				System.out.println("Enter the valid option either (Y) or (N)");
			}

		}

		System.out.println("Thank you");

	}
}
