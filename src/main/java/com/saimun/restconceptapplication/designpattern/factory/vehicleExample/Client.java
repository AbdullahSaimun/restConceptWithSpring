package com.saimun.restconceptapplication.designpattern.factory.vehicleExample;

public class Client {
	public static void main(String[] args) {
		VehicleFactory carfactory = new CarFactory();
		Vehicle car = carfactory.createVehicle();
		car.start();
		car.start();

		VehicleFactory bikeFacotry =new BikeFactory();
		Vehicle bike = bikeFacotry.createVehicle();
		bike.start();
		bike.stop();
	}
}
