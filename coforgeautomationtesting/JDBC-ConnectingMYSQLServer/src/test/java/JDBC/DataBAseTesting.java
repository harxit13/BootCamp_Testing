package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataBAseTesting {
	private Connection connection;
	@Test
	public void establishDataBaseConnection() {
		String databaseURL = "";
		String user = "";
		String password ="";
		
		class.forName("");
		System.out.println("Connecting to Databse");
		connection = DriverManager.getConnection(databaseURL, user, password);
		
		if(connection == null) {
			System.out.println("Database Connection Failed");
		}else {
			System.out.println("Database Connection Successfull");
		}
	}

}
