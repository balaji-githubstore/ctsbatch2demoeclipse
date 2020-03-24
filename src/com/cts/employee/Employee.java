package com.cts.employee;

public class Employee {

	public int empId;
	public String empName;
	public String empBaseLocation;
	public double empSalary;
	public static String empCompanyName;
	
	
	public static void printEmployeeDetails(Employee obj) {
		// TODO Auto-generated method stub
		System.out.println(obj.empId);
		System.out.println(obj.empName);
		System.out.println(obj.empBaseLocation);
		System.out.println(obj.empSalary);
		System.out.println(Employee.empCompanyName);
	}
	
	
	public static Employee getHighPaidEmployeeProfile(Employee x,Employee y)
	{
		if(x.empSalary>y.empSalary)
		{
			return x;
		}
		else
		{
			return y;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public static void printEmployeeDetails( )
//	{
//		System.out.println(empId);
//		System.out.println(empName);
//		System.out.println(BaseLocation);
//		System.out.println(Salary);
//	}
	
	
}
