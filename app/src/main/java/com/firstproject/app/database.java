package com.firstproject.app;

import java.sql.DriverManager;

public class database {
	
	
	public static void main(String[] Args) {
		
		try{
			DriverManager.getConnection("jdbc:mysql://localhost:3306/spring","root","Manish#@20");
			System.out.println("connected");
		}catch(Exception e) {
			System.out.println("not connected");
		}
	}

}
