package com.curverOperation.SQL;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CURVEROPERATION {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String databaseURL = "jdbc:mysql://localhost:3306/SeleniumAutomation";
		String user = "root";
		String password = "8755185366@aQ";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection(databaseURL,user,password);
		Statement stmt = connection.createStatement();
		String query = "INSERT INTO book_detl values ('AI001', 'PostmanAI', 'API', 'Harshit', 'ABC', 'S', '2026')";
		
		stmt.execute(query);
		connection.close();
		System.out.println();
	}

}
