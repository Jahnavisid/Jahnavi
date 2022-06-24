package jdk5andabove;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDemo5 {

	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");;
		Connection con=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/tech","root","root");
       System.out.println(con);
   	String sql="select * from users";
	Statement stmt=con.createStatement();
	
	ResultSet rs=stmt.executeQuery(sql);
       while(rs.next()) {
       System.out.println(rs.getInt("uid")+":"+rs.getString("uname"));
	}

	}
}

   
