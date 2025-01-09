package org.javaturk.oofp.training.shapetraining;


public class Shape {
	
	protected String name;
	public static final int TEST_INT = 5;
	
	public Shape (String name) {
		this.name=name;
	}

	protected void draw() {
		System.out.println("Draw a shape");
	}
	
	protected void erase() {
		System.out.println("Erase Shape");
	}
	
	protected double calculateArea() {
		System.out.println("calculate area");
		return TEST_INT * 5;
	}
	
	protected double calculateCircumference() {
		System.out.println("calculate circumference");
		return TEST_INT * 9;
	}	

}
