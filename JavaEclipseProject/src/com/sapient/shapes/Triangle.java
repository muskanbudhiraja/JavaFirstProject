package com.sapient.shapes;

public class Triangle {
	private int Sides;
	Triangle(){}
	Triangle(int Sides){
		this.Sides=Sides;
	}
	double calculateArea() {
		return 0.433*Sides*Sides;
	}
}
