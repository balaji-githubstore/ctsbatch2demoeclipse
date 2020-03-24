package com.cts.prop;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

public class PropTest {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file =new FileInputStream("resources/data.properties");
		
		Properties prop=new Properties();
		prop.load(file);
		
		String baseUrl= prop.getProperty("url");
		
		System.out.println(baseUrl);
		
		HashMap<String, String> map=new HashMap<String, String>();
		
		for(Object key :prop.keySet())
		{
			map.put(key.toString(), prop.getProperty(key.toString()));
		}
		
		System.out.println(map);

	}

}
