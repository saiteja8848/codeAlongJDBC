package mainapp;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

	
	public static Connection getConnection() throws SQLException {
		
		Connection con = null;
		con = DriverManager.getConnection( "jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
	    if(con!=null) {
	    	System.out.println("Connection Established");
	    }
	    else
	    	System.out.println("Check out connection");
		
		return con;
	}

}
