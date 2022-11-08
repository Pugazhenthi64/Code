package com.te.javabasics.abstraction;

import java.util.Scanner;

public class Occurence {

	void occurence() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the word to find the occurence");
		String input = scanner.nextLine();
		boolean[] check=new boolean[input.length()-1];
		boolean[] valid=new boolean[input.length()-1];
		for (int i=0; i<input.length();i++) {
			int count=1;
			for(int y=1; y<input.length()-2; y++) {

				if((input.charAt(i)==input.charAt(y)) && check[y]==false) {

					valid[y]=true;
					count++;
					check[y]=true;

				}


			}
				System.out.println(input.charAt(i)+"  occured"+count);

		}
	}

	

}
