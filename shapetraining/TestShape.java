package org.javaturk.oofp.training.shapetraining;

public class TestShape {
	
	public static void main (String[] args) {
		ShapeFactory factory = new ShapeFactory();
		Shape s = factory.createShape();
		
		s.draw();
		s.erase();
		System.out.println(s.calculateArea());
		System.out.println(s.calculateCircumference());
	}
}
