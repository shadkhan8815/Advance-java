package com.rays.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestDelete {
	
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java", "root", "root");

		Statement st = con.createStatement();

		int i = st.executeUpdate("delete from emp where id = 10");
		
		System.out.println("data deleted :" + i);

	}

}
