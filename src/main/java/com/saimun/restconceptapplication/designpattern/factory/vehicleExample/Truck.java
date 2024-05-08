package com.saimun.restconceptapplication.designpattern.factory.vehicleExample;

public class Truck extends Vehicle {

	@Override
	public void start() {
		System.out.println("Truck is starting");
	}

	@Override
	public void stop() {
		System.out.println("Truck is stopping");
	}
}
