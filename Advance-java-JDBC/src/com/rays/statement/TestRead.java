package com.rays.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestRead {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java", "root", "root");

		Statement st = con.createStatement();

		ResultSet rs = st.executeQuery("select * from emp");

		while (rs.next()) {
			System.out.print("\t" + rs.getInt(1));
			System.out.print("\t" + rs.getString(2));
			System.out.println("\t" + rs.getInt(3));
		}

	}

}
