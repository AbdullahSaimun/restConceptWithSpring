package com.saimun.restconceptapplication.designpattern.factory.bankExample;

public class GenerateBill {
	public static void main(String[] args) {
		GetPlanFactory factory = new GetPlanFactory();
		Plan pp = factory.getPlan("domestic");
		pp.getRate();
		pp.calculateBill(10);
	}
}
