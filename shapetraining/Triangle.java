package org.javaturk.oofp.training.shapetraining;

public class Triangle extends Shape{
	
	private double height;
	private double base_edge;
	
	public Triangle (String name, double height, double base_edge) {
		super(name);
		this.height=height;
		this.base_edge=base_edge;
	}
	
	@Override
	protected void draw() {
		System.out.println("Drawing Triangle");
	}
	
	@Override
	protected void erase() {
		System.out.println("Erasing Triangle");
	}
	
	@Override
	protected double calculateArea() {
		System.out.println("Triangle Area Calculated");
		return height * base_edge/2;
	}
	
	@Override
	protected double calculateCircumference() {
		System.out.println("Triangle Circumference calculated");
		return 3*base_edge;
	}

}
