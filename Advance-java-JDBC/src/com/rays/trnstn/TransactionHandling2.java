package com.rays.trnstn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TransactionHandling2 {

	public static void main(String[] args) throws Exception {

		Connection conn = null;

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java", "root", "root");

			Statement stmt = conn.createStatement();

			int i = stmt.executeUpdate("insert into emp values(13, 'aryant', 200)");

			i = stmt.executeUpdate("insert into emp values(14, 'aryant', 250)");

			i = stmt.executeUpdate("insert into emp values(14, 'aryant', 550)");

			System.out.println("data inserted => " + i);

		} catch (Exception e) {

			System.out.println("exception: " + e.getMessage());

		} finally {
			conn.close();
		}
	}
}

// roll back method  ka use nahi krenge to exception aane per bhi data insert ho jayega table  me 
