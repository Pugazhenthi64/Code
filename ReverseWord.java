package com.te.javabasics.abstraction;

import java.util.Scanner;

public class ReverseWord {
	
	void reverseWordOnly() {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the para to reverse the only word");
		String para=scanner.nextLine();
		String[] str=para.split(" ");
		String output = "";
		for(int i=0; i<str.length;i++) {
			for(int j=str[i].length()-1;j>=0;j--) {
				output=output+str[i].charAt(j);
			}
			output+="";
			
		}
		System.out.println(output);
	}
	
public static void main(String[] args) {
	
	ReverseWord reverseWord = new ReverseWord();
	reverseWord.reverseWordOnly();
	
}
}
