package com.saimun.restconceptapplication.designpattern.factory.bankExample;

public class GetPlanFactory {

	public Plan getPlan(String planType) {
		if (planType == null) {
			return null;
		}
		if (planType.equalsIgnoreCase("domestic")) {
			return new DomesticPlan();
		}
		if (planType.equalsIgnoreCase("commercial")) {
			return new CommercialPlan();
		}
		if (planType.equalsIgnoreCase("institute")) {
			return new InstitutionalPlan();
		}
		return null;

	}
	
}
