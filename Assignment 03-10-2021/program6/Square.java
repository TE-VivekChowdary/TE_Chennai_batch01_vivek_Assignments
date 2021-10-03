package com.te.Assignment;

public class Square {
	
	double area;
	double perimeter;

	public void squareArea(double side) {
		this.area = side * side;
		System.out.println("The area of Square is "+area);
	}

	public void squarePerimeter(double side) {
		this.perimeter = 4 * side;
		System.out.println("The Perimeter of Square is "+perimeter);

	}

}
