package jdk5andabove;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JDBCDemo4 {

	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/tech","root","root");
		System.out.println(con);
      
		String sql="update users set flag=? where uid=?";
		PreparedStatement stmt=con.prepareStatement(sql);
		while(true) {
			Scanner sc=new Scanner(System.in);
			System.out.println("please enter the uid...");
			int uid=sc.nextInt();
			System.out.println("please enter the flag value...");
			int flag=sc.nextInt();
			stmt.setInt(1,flag);
			stmt.setInt(2,uid);
			int noofrowschanged=stmt.executeUpdate();
			System.out.println("no of rows updated...:"+noofrowschanged);
		}
	}

		
		
	}


