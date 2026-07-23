package JDBC;

import java.sql.ResultSet;
import java.sql.Statement;

public class DataBaseTest {
	@Test
	public void testDatabaseConnection() {
		String databaseURL = "";
		String user = "";
		String password ="";
		
		class.forName("");
		System.out.println("Connecting to Databse");
		connection = DriverManager.getConnection(databaseURL, user, password);
		Statement stmt = con.createStatement();
		
		String query = "SELECT * FROM SeleniumAutomation.book_detl;";
		ResultSet rs= stmt.executeQuery(query);
		
		while(rs.next()) {
			String auth = rs.getString("");
			String tit = rs.getString("title");
			System.out.println("author: "+ auth + ",title:" + tit);
		}
		con.clese();
	}

}
