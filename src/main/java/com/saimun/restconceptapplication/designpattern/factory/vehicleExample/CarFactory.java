package com.saimun.restconceptapplication.designpattern.factory.vehicleExample;

public class CarFactory extends VehicleFactory {

	@Override
	public Vehicle createVehicle() {
		return new Car();
	}
}

