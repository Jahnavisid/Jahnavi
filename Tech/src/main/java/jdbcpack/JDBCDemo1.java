package jdbcpack;

import java.sql.Connection;
import java.sql.DriverManager;



import java.sql.CallableStatement;

public class JDBCDemo1 {

	public static void main(String[] args)throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager
				.getConnection("jdbc:mysql://localhost:3306/anound","root","root");
		System.out.println(con);
		String sql="{call proce2(?,?)}";
		CallableStatement cs=con.prepareCall(sql);
		cs.setString(1,"navi");
		cs.setInt(2, 0);
		int noofchanges=cs.executeUpdate();
		System.out.println("No of changes..:"+noofchanges);
	}
}
