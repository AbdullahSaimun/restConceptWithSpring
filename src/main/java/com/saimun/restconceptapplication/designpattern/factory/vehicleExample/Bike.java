package com.saimun.restconceptapplication.designpattern.factory.vehicleExample;

public class Bike extends Vehicle {

	@Override
	public void start() {
		System.out.println("Bike is Starting");
	}

	@Override
	public void stop() {
		System.out.println("Bike is stopping");

	}
}

