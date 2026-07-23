package com.curverOperation.SQL;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteSSQL {
	Connection connection;
	public void establishDataBaseConnection() throws ClassNotFoundException, SQLException{
		//Database connection details
		String databaseURL ="jdbc:mysql://localhost:3306/SeleniumAutomation";
		String user="root";
		String password="8755185366@aQ";
		//Loading the mYsql JDBC driver and establishing connection
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Connecting to Database");
		connection=DriverManager.getConnection(databaseURL,user,password);
		
		//Checking if the connection was made successfully
		if(connection==null)
		{
			System.out.println("The conncetion failed");
		}
		else
		{
			System.out.println("The connection was made Successfully");
		}
		
		Statement smt=connection.createStatement();
		String query="delete from book_detl where book_no='AT012';";
		smt.execute(query);
		connection.close();
	}
}
