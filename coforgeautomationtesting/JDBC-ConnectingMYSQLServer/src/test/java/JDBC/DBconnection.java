package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
	static void main(String[] args)  {
		
			try {
				Connection con= DriverManager.getConnection("");
				System.out.println("Database Connected successfully");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

}
