package com.cts.datatypes;

public class DatatypesDemo {
	

	public static void main(String[] args) {
	
		
		String text1 = "$1,200,000";
		String text2 ="$1,200";
		
		text1 = text1.replace("$", "").replace(",", "");
		text2 = text2.replace("$", "").replace(",", "");
		
		 int t1=  Integer.parseInt(text1);
	   	int t2=Integer.parseInt(text2);
		System.out.println(t1+t2);
		
		
		
		
		//string is immutable
		String text="hello"; //one object
		text = "my world"; //second object
		
		
		
		
		// == -->compares location and then text
		// .equals -->compares only text
		String name ="red";
		String name1 ="red";
		
		System.out.println(name==name1);
		
		
		String color1 =new String("red");
		String color2=new String("red");
		
		
		System.out.println(color1 == color2);
		System.out.println(color1.equals(color2));
		
		
		
		
		
		//20
//		radius =20;
//		
//		area= 3.14*radius*radius;
//		System.out.println(area);
//		
//	radius =30;
//		
//		area= 3.14*radius*radius;
//		System.out.println(area);
		
		
		
		/*
		 * String name ="balaji";
		 * 
		 * 
		 * char letter = name.charAt(1);
		 * 
		 * System.out.println(letter);
		 */
		
		/*
		 * String[] names = new String[5];
		 * 
		 * 
		 * names[0]="red";
		 * 
		 * 
		 * // String name0 = names[0]; // char letter1 = name0.charAt(1);
		 * 
		 * char c = names[0].charAt(1); System.out.println(c);
		 */
		
		
		/*
		 * int a =10;
		 * 
		 * int b=20;
		 * 
		 * int[] arr=new int[3]; int[] arr1=new int[3];
		 * 
		 * arr1=new int[10];
		 */
		// TODO Auto-generated method stub
		
		//System.out.println("hello1234546454554");
		
		//radius = 10;
		//int radius =10;
		
		//char letter='#';
		/*
		 * System.out.println((double)22/7*10*10);
		 * 
		 * double area= (double)22/7*10*10;
		 * 
		 * 
		 * System.out.println(area);System.out.println("done!!");
		 */
//		
//			double a=1.256745454545;
//			System.out.println(a);
//			
//			float b=(float) a ; //leads to data loss
//			
//			double c =b;//implicit conversion
//			
//			System.out.println(b);
			
		
		/*
		 * int[] numbers=new int[3]; System.out.println(numbers); numbers=new int[4];
		 * 
		 * numbers[0]=10;
		 * 
		 * System.out.println(numbers[0]);
		 * 
		 * 
		 * 
		 * String[] names=new String[3];
		 * 
		 * 
		 * System.out.println(names[4]);
		 * 
		 * 
		 * String name ="red";
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}






















