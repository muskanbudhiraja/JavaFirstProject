package com.sapient.shapes;

public class Circle {
	private int Radius;
	Circle(){}
	Circle(int Radius)
	{
		this.Radius=Radius;
	}
	double calculateArea()
	{
		return 3.14 * Radius * Radius;
	}
}
