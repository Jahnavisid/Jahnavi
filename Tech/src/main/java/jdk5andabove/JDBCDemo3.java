package jdk5andabove;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class JDBCDemo3 {

	public static void main(String[] args) throws Exception{
		//Step1 - Load the Driver.
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Step 2 - Establish Connection
		Connection con=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/tech","root","root");
		
		System.out.println(con);
		//Step 3 - Execute sql statement
		
		String sql="update users set flag=? where uid=?";
		PreparedStatement stmt=con.prepareStatement(sql);
		
		stmt.setInt(1, 6 );
		stmt.setInt(2, 4);
		
		int noofrowschanged=stmt.executeUpdate();
		
		//step 4 - process result
		
		System.out.println("No of rows updated...:"+noofrowschanged);
	}

}


