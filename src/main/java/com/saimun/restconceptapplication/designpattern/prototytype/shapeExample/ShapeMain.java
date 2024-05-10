package com.saimun.restconceptapplication.designpattern.prototytype.shapeExample;

public class ShapeMain {
	public static void main(String[] args) {
		Circle originalCircle = new Circle(5);
		Circle newCircle = (Circle) originalCircle.clone();

		Square originalSquare = new Square(10);
		Square newSquare = (Square) originalSquare.clone();

		System.out.println("Original circle radius: " + originalCircle.getRadius());
		System.out.println("New circle radius: " + newCircle.getRadius());

		System.out.println("Original square side length: " + originalSquare.getSideLength());
		System.out.println("New square side length: " + newSquare.getSideLength());

		// Modify the clones
		newCircle.setRadius(9);
		newSquare.setSideLength(13);

		System.out.println("Original circle radius (unchanged): " + originalCircle.getRadius());
		System.out.println("New circle radius (modified): " + newCircle.getRadius());

		System.out.println("Original square side length (unchanged): " + originalSquare.getSideLength());
		System.out.println("New square side length (modified): " + newSquare.getSideLength());

	}
}
