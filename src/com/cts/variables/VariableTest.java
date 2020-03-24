package com.cts.variables;

public class VariableTest {
	public static int aS=10; //static variable or class variable
	public static int bS=20;
	public int aNS=10; //non-static variable or instance variable
	public int bNS=20;
	

	public static void main(String[] args) {
	
		System.out.println(VariableTest.aS);
		
		System.out.println("---------------------");
		
		VariableTest obj1=new VariableTest();
		System.out.println(obj1);
		obj1.aNS=150;
		System.out.println(obj1.aNS);
		System.out.println(obj1.bNS);
		
		System.out.println("---------------");
		
		VariableTest obj2=new VariableTest();
		System.out.println(obj2);
		
		obj2=obj1=null;
		
		obj2.aNS=500;
		
		System.out.println(obj1);
		System.out.println(obj2);
		
		System.out.println(obj2.aNS);
		System.out.println(obj2.bNS);
		
		System.out.println(obj1.aNS);
		System.out.println(obj1.bNS);
		
		System.out.println("---------------");
		
		VariableTest obj3=new VariableTest();
		System.out.println(obj3);
		System.out.println(obj3.aNS);
		System.out.println(obj3.bNS);
	}

}





