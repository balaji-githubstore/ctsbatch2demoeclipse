package com.cts.methods;

public class Area {
	// accessmodifier static returntype areaOfCircle(radius)

	public double areaOfCircle(int r) {
		double result = 3.14 * r * r;
		return result;
	}

	// areaoftriangle
	
	public static double areaOfTriangle(double base,double height)
	{
		return base*height/2;
	}

}
