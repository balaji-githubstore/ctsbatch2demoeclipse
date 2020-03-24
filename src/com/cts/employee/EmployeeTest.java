package com.cts.employee;

import java.util.ArrayList;

public class EmployeeTest {

	public static void main(String[] args) {
		//101, jack, 3000, chennai, cts
		//102, peter, 5000, bangalore, cts
		//103, mark, 6000, mysore, cts
		
		Employee.empCompanyName="CTS";
		
		Employee emp1=new Employee();
		emp1.empId=101;
		emp1.empName="Jack";
		emp1.empSalary=3000;
		emp1.empBaseLocation="Chennai";
		
		System.out.println(emp1);
		
		Employee.printEmployeeDetails(emp1);
		
		Employee emp2=new Employee();
		emp2.empId=102;
		emp2.empName="Peter";
		emp2.empSalary=5000;
		emp2.empBaseLocation="Bangalore";
		
		System.out.println(emp2);
		
		Employee.printEmployeeDetails(emp2);
		
		
		String name="bala";
		
		Employee h= Employee.getHighPaidEmployeeProfile(emp1, emp2);
		
		Employee.printEmployeeDetails(h);
		
		
		/*
		 * // String[] colors=new String[2]; // colors[0]="red"; // colors[1]="blue";
		 * 
		 * // String color0=colors[0];
		 * 
		 * 
		 * Employee[] emps=new Employee[2]; emps[0]=emp1; emps[1]=emp2;
		 * 
		 * System.out.println(emps[0].empId);
		 * 
		 * for(int i=0;i<emps.length;i++) { Employee e= emps[i]; e.empId=50000000;
		 * System.out.println(e.empId);
		 * 
		 * }
		 * 
		 * System.out.println(emp1.empId); System.out.println(emps[0].empId);
		 * 
		 * 
		 * // ArrayList lists=new ArrayList(); // lists.add(10); // lists.add(25.0); //
		 * lists.add(emp1); // // // int list0 = (int) lists.get(0);
		 * 
		 * ArrayList<Integer> lists=new ArrayList<Integer>(); lists.add(10);
		 * lists.add(50);
		 * 
		 * 
		 * 
		 * // int list0 = (int) lists.get(0);
		 * 
		 * 
		 * // Object b=emp1;
		 * 
		 * Employee obj = (Employee) b; System.out.println(obj.empId);
		 * 
		 * // int[] numbers=new int[3]; // numbers[0]=45;
		 * 
		 * int[] numbs= {45,85,65,95};
		 * 
		 * System.out.println(numbs.length);
		 * 
		 * 
		 * for(int i=0;i<numbs.length;i++) { System.out.println(numbs[i]); }
		 * System.out.println("---------");
		 * 
		 * for(int value : numbs) { System.out.println(value); }
		 * 
		 * 
		 * //Anyone // Employee[] emps1=new Employee[2]; // emps1[0]=emp1; //
		 * emps1[1]=emp2; // // // String[] colors ={"red","blue","yellow","green"}; //
		 * // // for(String color : colors) // { // System.out.println(color); // }
		 * 
		 * 
		 * ArrayList<String> listOfColors=new ArrayList<String>();
		 * listOfColors.add("red"); listOfColors.add("blue");
		 * listOfColors.add("yellow"); listOfColors.add("white");
		 * listOfColors.add("brown"); listOfColors.add("pink");
		 * 
		 * 
		 * int colorsCount = listOfColors.size(); System.out.println(colorsCount);
		 * 
		 * // String color0 = listOfColors.get(0); // System.out.println(color0);
		 * 
		 * for(int i = 0;i<colorsCount;i++) { String color0 = listOfColors.get(i);
		 * System.out.println(color0); if(color0.equals("blue")) {
		 * System.out.println(color0); break; } }
		 * 
		 * for(String color :listOfColors) { if(color.equalsIgnoreCase("blue")) {
		 * System.out.println(color); break; } }
		 */			
	}

}





























