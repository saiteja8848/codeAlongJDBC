package mainapp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginDao {

	public boolean validate(LoginPojo user) throws SQLException {
		String username = user.getUsername();
		String password = user.getPassword();
        boolean status=false;
		
		ConnectionManager con = new ConnectionManager();
		Statement st = con.getConnection().createStatement();

		ResultSet rs = st.executeQuery("SELECT * FROM USERDETAILS where username = username");

		while (rs.next()) {
			if (username.equals(rs.getString("USERNAME")) && password.equals(rs.getString("PASSWORD"))) {
				con.getConnection().close();
				status=true;
				break;
			} else {
				con.getConnection().close();
				status=false;
			}

		}

		return status;
	}

}
