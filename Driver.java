package com.te.javabasics.abstraction;

public class Driver {
	
	public  void acces(Car car) {
		car.brake();
		car.engine();
		car.gear();
		car.airBag();
		car.gps();
	}

}
