package com.te.javabasics.abstraction;

public class NonFind  {
	
	public static void main(String[] args) {
		String s="hi";
		String a=new String("hi");
		
		System.out.println(s.toString());
		System.out.println(a.toString());
		
		System.out.println(s.hashCode()== a.hashCode());
		System.out.println(a.hashCode());
		System.out.println(s.hashCode());
		System.out.println(s.equals(a));
	}
}
