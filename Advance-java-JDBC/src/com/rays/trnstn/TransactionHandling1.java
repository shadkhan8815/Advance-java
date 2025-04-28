package com.rays.trnstn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TransactionHandling1 {

	public static void main(String[] args) throws Exception {

		Connection conn = null;

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java", "root", "root");

			conn.setAutoCommit(false);

			Statement stmt = conn.createStatement();

			int i = stmt.executeUpdate("insert into emp values(11, 'aryant', 850)");

			i = stmt.executeUpdate("insert into emp values(12, 'aryant', 890)");

			i = stmt.executeUpdate("insert into emp values(12, 'aryant', 890)");

			conn.commit();

			System.out.println("data inserted => " + i);

		} catch (Exception e) {

			conn.rollback();
			System.out.println("exception: " + e.getMessage());

		} finally {
			conn.close();
		}
	}
}

// roll back use krenge to data file me insert nahi hoga exception aane per data 
//  data retrive ho jayega 
