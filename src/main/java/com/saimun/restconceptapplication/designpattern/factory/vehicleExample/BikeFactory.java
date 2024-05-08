package com.saimun.restconceptapplication.designpattern.factory.vehicleExample;

public class BikeFactory extends VehicleFactory {

	@Override
	public Vehicle createVehicle() {
		return new Bike();
	}
}

