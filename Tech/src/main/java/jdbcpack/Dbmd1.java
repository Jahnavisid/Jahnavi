package jdbcpack;
import java.sql.*;
public class Dbmd1 {

	public static void main(String[] args) {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/anound","root","root");
		Statement stmt=con.createStatement();
		ResultSet rs= stmt.executeQuery("select*from users");
		while(rs.next());
		System.out.println(rs.getInt("uid")+""+rs.getString("uname")+" "+rs.getString("city"));
		
         con.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		}
		
	}


