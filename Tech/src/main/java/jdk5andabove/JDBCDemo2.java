package jdk5andabove;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class JDBCDemo2 {
	public static void main(String[] args) throws Exception{
		//Step1 - Load the Driver.
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Step 2 - Establish Connection
		Connection con=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/tech","root","root");
		
		System.out.println(con);
		//Step 3 - Execute sql statement
		
		String sql="update users set flag=1";
		Statement stmt=con.createStatement();
		int noofrowschanged=stmt.executeUpdate(sql);
		
		//step 4 - process result
		
		System.out.println("No of rows updated...:"+noofrowschanged);
	}
}