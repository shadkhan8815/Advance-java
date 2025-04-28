package com.rays.preparedstatement_dynamic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateDynamic {

	public static void main(String[] args) throws Exception {

		// testUpdate1();
		// testUpdate2();
		// testUpdate3(111, "ansh", 87, 78, 56,11);

		MarksheetBean bean = new MarksheetBean();
		bean.setId(12);
		bean.setRollNo(112);
		bean.setName("khush");
		bean.setPhysics(10);
		bean.setChemistry(20);
		bean.setMaths(30);

		testUpdate4(bean);

	}
          // step 1
	public static void testUpdate1() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java", "root", "root");

		PreparedStatement pstmt = conn.prepareStatement(
				"update marksheet set rollnumber = 012, name = 'madhu', physics = 11, chemistry = 11, maths = 11 where id = 12");

		int i = pstmt.executeUpdate();

		System.out.println("data updated => " + i);

	}
          // step 2
	public static void testUpdate2() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java", "root", "root");

		PreparedStatement pstmt = conn.prepareStatement(
				"update marksheet set rollnumber = ?, name = ?, physics = ?, chemistry = ?, maths = ? where id = ?");

		pstmt.setInt(1, 110);
		pstmt.setString(2, "shyam");
		pstmt.setInt(3, 18);
		pstmt.setInt(4, 25);
		pstmt.setInt(5, 98);
		pstmt.setInt(6, 11);

		int i = pstmt.executeUpdate();

		System.out.println("data updated => " + i);

	}
          // step 3
	public static void testUpdate3(int rollNo, String name, int physics, int chemistry, int maths, int id)
			throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java", "root", "root");

		PreparedStatement pstmt = conn.prepareStatement(
				"update marksheet set rollnumber = ?, name = ?, physics = ?, chemistry = ?, maths = ? where id = ?");

		pstmt.setInt(1, rollNo);
		pstmt.setString(2, name);
		pstmt.setInt(3, physics);
		pstmt.setInt(4, chemistry);
		pstmt.setInt(5, maths);
		pstmt.setInt(6, id);

		int i = pstmt.executeUpdate();

		System.out.println("data updated => " + i);

	}
             // step 4
	public static void testUpdate4(MarksheetBean bean) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java", "root", "root");

		PreparedStatement pstmt = conn.prepareStatement(
				"update marksheet set rollnumber = ?, name = ?, physics = ?, chemistry = ?, maths = ? where id = ?");

		pstmt.setInt(1, bean.getRollNo());
		pstmt.setString(2, bean.getName());
		pstmt.setInt(3, bean.getPhysics());
		pstmt.setInt(4, bean.getChemistry());
		pstmt.setInt(5, bean.getMaths());
		pstmt.setInt(6, bean.getId());

		int i = pstmt.executeUpdate();

		System.out.println("data updated => " + i);

	}
}