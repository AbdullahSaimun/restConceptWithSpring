package com.saimun.restconceptapplication.designpattern.factory.vehicleExample;

public class TruckFactory extends VehicleFactory {

	@Override
	public Vehicle createVehicle() {
		return new Truck();
	}
}

