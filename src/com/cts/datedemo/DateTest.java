package com.cts.datedemo;

import java.util.Date;

public class DateTest {
	
	public static void main(String[] args) {
		
		Date date=new Date();
		
		String dateStr=date.toString().replace(":", "-");
		
		System.out.println(dateStr);
		
		
	}

}
