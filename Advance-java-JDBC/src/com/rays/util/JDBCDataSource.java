package com.rays.util;

import java.sql.Connection;
import java.util.ResourceBundle;

import com.mchange.v2.c3p0.ComboPooledDataSource;

// DCP / JDBCDataSource is a singleton class

// step - 1 : make class final so child can not be create

public final class JDBCDataSource {

	// step - 2 : make default cnstr private so no one other class can instance this
	// class

	private JDBCDataSource() {

	}

	// step - 3 : make same type of private static variable/attribute, static
	// variable
	// have one
	// copy in a life time

	private static JDBCDataSource datasource = null;

	private static ComboPooledDataSource cpds = null;

	private static ResourceBundle rb = ResourceBundle.getBundle("com.rays.bundle.app");

	// step - 4 : make a getInstance() method that return instance of same type
	private static JDBCDataSource getInstance() {

		if (datasource == null) {

			datasource = new JDBCDataSource();
			datasource.cpds = new ComboPooledDataSource();

			try {

				datasource.cpds.setDriverClass(rb.getString("driver"));
				datasource.cpds.setJdbcUrl(rb.getString("url"));
				datasource.cpds.setUser(rb.getString("username"));
				datasource.cpds.setPassword(rb.getString("password"));
				datasource.cpds.setMaxPoolSize(Integer.parseInt(rb.getString("maxPoolSize")));
				datasource.cpds.setMinPoolSize(Integer.parseInt(rb.getString("minPoolSize")));
				datasource.cpds.setInitialPoolSize(Integer.parseInt(rb.getString("initialPoolSize")));
				datasource.cpds.setAcquireIncrement(Integer.parseInt(rb.getString("acquireIncrement")));

			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		return datasource;

	}

	public static Connection getConnection() throws Exception {

		return getInstance().cpds.getConnection();

	}

	public static void closeConnection(Connection connection) {
		if (connection != null) {
			try {
				connection.close();
			} catch (Exception e) {
			}
		}
	}

	public static void trnRollback(Connection connection) throws Exception {
		if (connection != null) {
			try {
				connection.rollback();
			} catch (Exception ex) {
				throw new Exception(ex.toString());
			}
		}
	}

}