package jdk5andabove;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCDemo7 {

	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/tech","root","root");

	}

}
