package com.shopcart.dao.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {

	static Connection connection;

	public static Connection getConnetion() {
		try {
			Class.forName("org.h2.Driver");

			if (connection == null || connection.isClosed()) {
				connection = DriverManager.getConnection("", "", "");
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		return connection;
	}
}
