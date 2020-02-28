package jdbc;
import java.sql.*;
public class JdbcPreparedStatementTest {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/test?autoReconnect=true&useSSL=false","root","root");
		/*PreparedStatement p=c.prepareStatement("Insert into test.phone values(?,?,?)");
		p.setInt(1,4);
		p.setString(2,"Abhishek");
		p.setInt(3,993891);	
		p.executeUpdate();*/
		PreparedStatement p1=c.prepareStatement("Select * from test.phone where Phone Like ?");
		p1.setString(1,"99389%");
		ResultSet r=p1.executeQuery();
		while(r.next())
		{
			System.out.println(r.getInt("idPhone")+" "+r.getString("Name")+" "+r.getInt("Phone"));
		}
		}

}
