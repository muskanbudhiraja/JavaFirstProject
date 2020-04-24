package com.sapient.shapes;

public class Shapes {
	private int noOfSides;
	public Shapes(){}
	public Shapes(int noOfSides) {
		this.noOfSides=noOfSides;
	}
	public static void main(String[] args) {
		Shapes shapeCircle=new Shapes(1);
		shapeCircle.calculateShapeArea(12);
		Shapes shapeTriangle=new Shapes(4);
		shapeTriangle.calculateShapeArea(15);
		Shapes shape=new Shapes(5);
		shape.calculateShapeArea(15);
	}
	void calculateShapeArea(int sideLength) {
		switch(noOfSides){
			case 1:
				Circle circle=new Circle(sideLength);
				System.out.println("The area of the Circle is "+ circle.calculateArea());
				break;
			case 3:
				Triangle triangle=new Triangle(sideLength);
				System.out.println("The area of the Triangle is "+ triangle.calculateArea());
				break;
			case 4:
				Square square=new Square(sideLength);
				System.out.println("The area of the Square is "+ square.calculateArea());
				break;
			default:
				System.out.println("No Shapes Present");
				break;
		}
	}
}
