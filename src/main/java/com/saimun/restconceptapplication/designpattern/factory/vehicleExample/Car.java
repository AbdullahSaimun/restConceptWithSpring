package com.saimun.restconceptapplication.designpattern.factory.vehicleExample;

public class Car extends Vehicle {

	@Override
	public void start() {
		System.out.println("Car is starting");
	}

	@Override
	public void stop() {
		System.out.println("Car is stopping");

	}
}

