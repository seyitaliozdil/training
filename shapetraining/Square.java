package org.javaturk.oofp.training.shapetraining;

public class Square extends Shape {
	
	private double edge;
	public Square (String name, double edge ) {
		super(name);
		this.edge = edge;
	}
	
	@Override
	protected void draw() {
		System.out.println("Drawing Square");
	}
	
	@Override
	protected void erase() {
		System.out.println("Erasing Square");
	}
	
	@Override
	protected double calculateArea() {
		System.out.println("Square Area Calculated");
		return Math.pow(edge, 2);
	}
	
	@Override
	protected double calculateCircumference() {
		System.out.println("Square Circumference calculated");
		return 4*edge;
	}
}
