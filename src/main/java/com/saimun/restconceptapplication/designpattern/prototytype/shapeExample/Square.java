package com.saimun.restconceptapplication.designpattern.prototytype.shapeExample;

public class Square implements Shape{

	private int sideLength;

	public Square(int sideLength) {
		this.sideLength = sideLength;
	}

	public int getSideLength() {
		return sideLength;
	}

	public void setSideLength(int sideLength) {
		this.sideLength = sideLength;
	}

	@Override
	public Shape clone() {
		return new Square(this.sideLength);
	}
}
