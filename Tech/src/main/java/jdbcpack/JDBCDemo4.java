package jdbcpack;


import java.sql.DatabaseMetaData;
import java.sql.Connection;
import java.sql.DriverManager;


public class JDBCDemo4 {
public static void main(String[] args)throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection
			("jdbc:mysql://localhost:3306/tech","root","root");
	System.out.println(con);
	DatabaseMetaData dbmd=con.getMetaData();
	System.out.println(dbmd.getDatabaseProductName());
	System.out.println(dbmd.getDatabaseProductVersion());
	
	System.out.println(dbmd.getUserName());
}
}
