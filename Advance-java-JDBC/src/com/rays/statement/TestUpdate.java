package com.rays.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestUpdate {
	
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java", "root", "root");

		Statement st = con.createStatement();

		int i = st.executeUpdate("update emp set salary = 950 where id = 6");
		
		System.out.println("data updated :" + i);

	}

}
