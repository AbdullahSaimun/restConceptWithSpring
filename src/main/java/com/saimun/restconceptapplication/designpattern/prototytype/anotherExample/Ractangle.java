package com.saimun.restconceptapplication.designpattern.prototytype.anotherExample;

import java.util.HashMap;

public class Ractangle implements ShapeAnother {

	@Override
	public void draw() {
		System.out.println("Drawing Ractangle");
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
