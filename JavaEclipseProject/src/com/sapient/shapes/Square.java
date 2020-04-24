package com.sapient.shapes;

public class Square {
	private int Sides;
	Square(){}
	Square(int Sides){
		this.Sides=Sides;
	}
	long calculateArea() {
		return Sides*Sides;
	}
}
