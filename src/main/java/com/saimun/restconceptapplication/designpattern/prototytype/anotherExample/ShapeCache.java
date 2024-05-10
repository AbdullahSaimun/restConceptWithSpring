package com.saimun.restconceptapplication.designpattern.prototytype.anotherExample;

import java.util.HashMap;

public class ShapeCache {
	private static HashMap<String , ShapeAnother> shapeMap = new HashMap<>();

	public static void loadCache() {
		Circle circle = new Circle();
		circle.draw();
		shapeMap.put("circle",circle);

		Ractangle ractangle = new Ractangle();
		ractangle.draw();
		shapeMap.put("ractangle",ractangle);
	}

	public static ShapeAnother getShape(String shapeId) {
		ShapeAnother cachedShape = shapeMap.get(shapeId);
		return (ShapeAnother) cachedShape.clone();
	}
}