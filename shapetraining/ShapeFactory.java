package org.javaturk.oofp.training.shapetraining;


public class ShapeFactory {
	
	public Shape createShape() {
		
	Shape s = null;
	
	int i = (int) (5 * Math.random());
	
	switch (i) {
	case 0: 
		s = new Circle("circle", 5);
		break;
	case 1: 
		s = new Rectangle("rectangle", 6, 12);
		break;
	case 2: 
		s = new Square("square", 7);
		break;
	case 3: 
		s = new Triangle("triangle", 6, 10);
		break;
	case 4:
		s = new Circle("circle2", 7);
		break;
	}
	return s;
	}

}
