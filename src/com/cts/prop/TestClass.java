package com.cts.prop;

public class TestClass {
	public static void main(String[] args) {
		String username = System.getProperty("user.name");
		System.out.println(username);
		String fileDetail = "C:\\Users\\" + username + "\\Downloads\\IEDriverServer_x64_3.150.1.zip";
		System.out.println(fileDetail);

	}
}
