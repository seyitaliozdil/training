package org.javaturk.oofp.training.shapetraining;


public class Circle extends Shape{
	
	private double radius;
	
	public Circle(String name, double radius) {
		super(name);
		this.radius=radius;
	}
	
	@Override
	protected void draw() {
		System.out.println("Drawing Circle");
	}
	
	@Override
	protected void erase() {
		System.out.println("Erasing Circle");
	}
	
	@Override
	protected double calculateArea() {
		System.out.println("Circle area calculated");
		return Math.PI * radius * radius;
	}
	
	@Override
	protected double calculateCircumference() {
		System.out.println("Circle Circumference calculated");
		return 2 * Math.PI * radius;
	}	
}
