package JDBCExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseConnection {

	public static void main(String[] args) {
		try
		{
			
		String uname = "root";
		String pwd = "1234";
		String url = "jdbc:mysql://localhost:3306/pooja?useSSL=false";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection co = DriverManager.getConnection(url,uname,pwd);
		String q = "select * from person";
		Statement s =  co.createStatement();
		ResultSet rs = s.executeQuery(q);
		while(rs.next())
		{
			int id = rs.getInt("id");
			String name = rs.getString("name");
			String email = rs.getString("email");
			String dob = rs.getString("dob");
			long phone = rs.getLong("phone");
			String address = rs.getString("address");
			System.out.println(id+" "+name+" "+email+" "+dob+" "+phone+" "+address);

		}
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		

	}

}
