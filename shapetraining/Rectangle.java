package org.javaturk.oofp.training.shapetraining;

public class Rectangle extends Shape {
	
	private double width;
	private double height;
	
	public Rectangle (String name,double width, double height) {
		super(name);
		this.width=width;
		this.height=height;
	}
	
	@Override
	protected void draw() {
		System.out.println("Drawing Rectangle");
	}
	
	@Override
	protected void erase() {
		System.out.println("Erasing Rectangle");
	}
	
	@Override
	protected double calculateArea() {
		System.out.println("Rectangle Area Calculated");
		return width * height;
	}
	
	@Override
	protected double calculateCircumference() {
		System.out.println("Rectangle Circumference calculated");
		return 2 * (width + height);
	}	

}
