package com.saimun.restconceptapplication.designpattern.prototytype.anotherExample;

public class Circle implements ShapeAnother {

	@Override
	public void draw() {
		System.out.println("Drawing Circle");
	}

	@Override
	public ShapeAnother clone() {
		try {
			return (ShapeAnother) super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
}
