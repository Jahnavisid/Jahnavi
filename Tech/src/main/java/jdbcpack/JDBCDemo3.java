package jdbcpack;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;
import java.sql.Statement;
public class JDBCDemo3 {

	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/anound","root","root");
		System.out.println(con);
		String sql="{call proc3(?)}";
		 CallableStatement cs=con.prepareCall(sql);
		 cs.registerOutParameter(1,Types.INTEGER);
		 cs.execute();
		 int countofcolumns=cs.getInt(1);
		 System.out.println("No of columns..:"+countofcolumns);
	}


	}


