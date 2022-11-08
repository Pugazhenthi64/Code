package com.te.javabasics.abstraction;

import java.util.Scanner;

public class CarFactory {
	
	public static Car getCar() {
		System.out.println("Enter the car specs you want");
		Scanner scanner = new Scanner(System.in);
		String type = scanner.nextLine();
		if(type.equalsIgnoreCase("audi")) {
			return new Audi();
		} else if (type.equalsIgnoreCase("bmw")) {
			return new Bmw();
		} else {
			return null;
		}
	}

}
