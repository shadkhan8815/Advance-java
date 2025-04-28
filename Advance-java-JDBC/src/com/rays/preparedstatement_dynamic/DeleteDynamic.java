package com.rays.preparedstatement_dynamic;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteDynamic {

	public static void main(String[] args) throws Exception {

		// testDelete1();
		// testDelete2();
		testDelete3(13);

	}
       // step 1
	public static void testDelete1() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java", "root", "root");

		PreparedStatement pstmt = conn.prepareStatement("delete from marksheet where id = 13");

		int i = pstmt.executeUpdate();

		System.out.println("data deleted => " + i);

	}
               // step 2
	public static void testDelete2() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java", "root", "root");

		PreparedStatement pstmt = conn.prepareStatement("delete from marksheet where id = ?");

		pstmt.setInt(1, 12);

		int i = pstmt.executeUpdate();

		System.out.println("data deleted => " + i);

	}
                  //step 3
	public static void testDelete3(int id) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java", "root", "root");

		PreparedStatement pstmt = conn.prepareStatement("delete from marksheet where id = ?");

		pstmt.setInt(1, id);

		int i = pstmt.executeUpdate();

		System.out.println("data deleted => " + i);

	}

}