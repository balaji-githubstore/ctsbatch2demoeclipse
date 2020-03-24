package com.cts.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
	public static void main(String[] args) {
		
		Map<String, String> map1 = new HashMap<String, String>();
		map1.put("cities","chennai");
		map1.put("country", "India");
		
		Map<String, String> map2 = new HashMap<String, String>();
		map2.put("cities","Hyderbad");
		map2.put("country", "India2");
		
		List<Map<String,String>> listsOfMap = new ArrayList<Map<String,String>>();
		listsOfMap.add(map1);
		
		listsOfMap.add(map2);
		
		for(int i=0;i<listsOfMap.size();i++)
		{
			String country = listsOfMap.get(i).get("cities");
			System.out.println(country);
			 country = listsOfMap.get(i).get("country");
			System.out.println(country);
		}
		
		
		
		
		
		
//		System.out.println(	map.size());
//		
//		if(map.containsKey("103"))
//		{
//			System.out.println(map.get("103"));
//		}
//	
//		map.put("101","peter");
		
		
		
	}
}
