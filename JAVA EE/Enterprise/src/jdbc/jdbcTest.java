package jdbc;
import java.sql.*;
public class jdbcTest {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/test?autoReconnect=true&useSSL=false","root","root");
		Statement stmt=c.createStatement();
		stmt.executeUpdate("DELETE from test.phone  WHERE idPhone = 1;");
		
		

	}

}
