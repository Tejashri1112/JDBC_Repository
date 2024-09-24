import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {

	public static void main(String[] args) throws Exception {
		//load and register driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//create connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3305/jdbc1", "root", "root");
		System.out.println("Connection Done");
		//create statement
		PreparedStatement ps=con.prepareStatement("insert into employee values (2,'John','john@gmail.com')");
		//executeUpdate() returns int value it is used for insert , update ,delete
		int a=ps.executeUpdate();
		
		if(a>0)
		{
			System.out.println("Record Inserted successfully");
			
		}
		else {
			System.out.println("Failed To Insert");
		}
		
		
		
	}

	

}
