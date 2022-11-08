package com.te.javabasics.abstraction;



public class RunningModel {
	public static void main(String[] args) {
	Car car = CarFactory.getCar();
	Driver driver = new Driver();
	driver.acces(car);
	
	
		
	}

}
