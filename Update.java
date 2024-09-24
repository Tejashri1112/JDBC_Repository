import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Update {

	public static void main(String[] args) throws Exception {
		
		// Load jdbc driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// create connection
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3305/jdbc1", "root", "root");
		System.out.println("Connection Done");
		// create statement
		PreparedStatement ps= con.prepareStatement("update employee set name='Tejashri' where eid=1");
		
		// execute query
		
		int a= ps.executeUpdate();
		
		if(a>0)
		{
			System.out.println("Record Updated Successfully");
		}
		else
		{
			System.out.println("Update Failed");
		}
			}

}
