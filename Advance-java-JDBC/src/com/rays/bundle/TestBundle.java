package com.rays.bundle;

import java.util.ResourceBundle;

public class TestBundle {

	public static void main(String[] args) {

		ResourceBundle rb = ResourceBundle.getBundle("com.rays.bundle.system");

		String driver = rb.getString("driver");
		String url = rb.getString("url");
		String username = rb.getString("username");
		String password = rb.getString("password");
		String initialpoolsize = rb.getString("initialpoolsize");
		String acquireincrement = rb.getString("acquireincrement");
		String maxpoolsize = rb.getString("maxpoolsize");
		String minpoolsize = rb.getString("minpoolsize");
		
            System.out.println(driver);
            System.out.println(url);
            System.out.println(username);
            System.out.println(password);
            System.out.println(initialpoolsize);
            System.out.println(acquireincrement);
            System.out.println(maxpoolsize);
            System.out.println(minpoolsize);
 	}

}
