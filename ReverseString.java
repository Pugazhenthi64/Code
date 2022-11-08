package com.te.javabasics.abstraction;

import java.util.Scanner;

public class ReverseString {
	
	String reverseString() {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String that you want to reverse");
		String input = scanner.nextLine();
		String output = "";
		for (int i=input.length()-1; i>=0; i--) {
			output=output+input.charAt(i);
		}
		return output;
	}

	
}
