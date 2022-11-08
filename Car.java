package com.te.javabasics.abstraction;

public interface Car {
	void engine();

	void brake();

	void gear();

	default void airBag() {
	}

	default void gps() {

	}

}
