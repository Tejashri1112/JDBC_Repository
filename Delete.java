import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Delete {

	public static void main(String[] args) throws Exception {
		
		//load driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// create connection
		 Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3305/jdbc1", "root", "root");
         System.out.println("Connection Done");
         
         //create Statement
        PreparedStatement ps= con.prepareStatement("delete from employee where eid=2");
        
        // execute query
        int a=ps.executeUpdate();
        
        if(a>0)
        {
        	System.out.println("Record Deleted Successfully");
        }
        else
        {
        	System.out.println("Failed to delete");
        }
	}

}
