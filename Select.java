import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Select {

	public static void main(String[] args) throws Exception {
		
		//Load Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//create connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3305/jdbc1", "root", "root");
		System.out.println("Conection Done");
		
		// create select statement
		PreparedStatement ps=con.prepareStatement("select * from employee");
		
		//execute query executeQuery() returns resultSet
		ResultSet it= ps.executeQuery();
		
		// if we want to show result set
		
		while(it.next())
		{   int id=it.getInt("eid");
			String name=it.getString("name");
			String email=it.getString("email");
			System.out.println("EId = "+id+" Name = "+name+"  Email = "+email);
			
		}
		}

}
