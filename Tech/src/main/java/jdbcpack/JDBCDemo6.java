package jdbcpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
public class JDBCDemo6 {
	public static void main(String[] args) throws Exception{
		//Step1 - Load the Driver.
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Step 2 - Establish Connection
		Connection con=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/tech","root","root");
		
		System.out.println(con);
		//Step 3 - Execute sql statement
		
		String sql="select * from users where uname=?";
		PreparedStatement stmt=con.prepareStatement(sql);
		
		stmt.setString(1, "robet");
		ResultSet rs=stmt.executeQuery();
		
		//step 4 - process result
		
		ResultSetMetaData rsmd=rs.getMetaData();
		int colcount=rsmd.getColumnCount();
		for(int i=1;i<=colcount;i++) {
			System.out.print(rsmd.getColumnName(i)+"\t");
		}
		System.out.println("\n=====================================================\n");
		if(rs.next()) {
			for(int i=1;i<=colcount;i++) {
				System.out.print(rs.getString(i)+"\t");
			}
		}
	}
}
