package mainapp;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDAO {

	public void addUser(RegisterPojo user) throws SQLException {
		String firstname = user.getFirstname();
		String lastname = user.getLastname();
		String username = user.getUsername();
		String email = user.getEmail();
		String password = user.getPassword();
        ConnectionManager cm = new ConnectionManager();
        String sql ="insert into USERDETAILS(FIRSTNAME,LASTNAME,USERNAME,PASSWORD,EMAIL) VALUES(?,?,?,?,?)";
		PreparedStatement stmt = cm.getConnection().prepareStatement(sql);
		
		stmt.setString(1, firstname);
		stmt.setString(2, lastname);
		stmt.setString(3, username);
		stmt.setString(4, password);
		stmt.setString(5, email);
		
		stmt.executeUpdate();
		cm.getConnection().close();
		
	}

}
