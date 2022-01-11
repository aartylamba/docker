package com.example.microservices;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnectionPool {

	static {
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/sonoo","root","root");  
			}
		catch(Exception e) {
			e.getStackTrace();
			
		}
		
}
