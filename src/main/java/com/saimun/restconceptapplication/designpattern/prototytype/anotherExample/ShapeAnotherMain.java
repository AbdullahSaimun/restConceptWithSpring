package com.saimun.restconceptapplication.designpattern.prototytype.anotherExample;

public class ShapeAnotherMain {
	public static void main(String[] args) {
		ShapeCache.loadCache();

		ShapeAnother cloneShape1 = ShapeCache.getShape("circle");
		cloneShape1.draw();

	}
}
