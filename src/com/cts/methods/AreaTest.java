package com.cts.methods;

public class AreaTest {


	public static void main(String[] args) {
		
		int radius = 10;

		
		Area obj=new Area();
		
		double area = obj.areaOfCircle(radius);
		System.out.println(area);

		
		int b=1; 
		int h=25;

		
		double result= Area.areaOfTriangle(1, 25);
		System.out.println(result);
		
		
	}

}
