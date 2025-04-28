package com.rays.mysql.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CnctWithDB {
	
	public static void main(String[] args) throws Exception {
		
		// Load Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Establis Connection
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java","root","root");
	
		//Create Statement
		Statement stmt = conn.createStatement();
		
		//Result Set 
		ResultSet rs = stmt.executeQuery(".......");
	}

}
