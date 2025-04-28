package com.rays.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestInsert {
	
	public static void main(String[] args) throws Exception {
		

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java", "root", "root");

		Statement st = con.createStatement();

		int i = st.executeUpdate("insert into emp values(10, 'mohit', 500)");
		
		System.out.println("data Inserted :" + i);
	}

}
