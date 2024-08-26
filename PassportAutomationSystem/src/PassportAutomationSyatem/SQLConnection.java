package PassportAutomationSyatem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLConnection {
	
	public static Connection getConnection() {
		
		Connection con = null;
		
		try {
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/PassportAutomationSystem" , "root" , "Pra9871@pgu");
			
			return con;
		}
		catch(SQLException e) {
			e.printStackTrace();
			return con;
		}
		
		
		
	}
	
	
	
	
	
	

}
