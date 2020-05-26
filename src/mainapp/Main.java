package mainapp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

public class Main {
	public static void main(String args[]) throws NumberFormatException, IOException, SQLException {
      System.out.println("1.Register here");
      System.out.println("2.Login");

      BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
      int x = Integer.parseInt(br.readLine());
      RegisterDAO registerDao = new RegisterDAO();
      RegisterPojo registerPojo = new RegisterPojo();
      LoginPojo loginPojo = new LoginPojo();
      LoginDao loginDao = new LoginDao();
      
      
      
      switch(x) {
      case 1:
    	System.out.println("Enter first name:");
    	String firstname = br.readLine();
    	System.out.println("Enter last name:");
    	String lastname = br.readLine();
    	System.out.println("Enter user name:");
        String username = br.readLine();
        System.out.println("Enter your password:");
        String password =  br.readLine();
        System.out.println("Enter your email:");
        String email = br.readLine();
        
        registerPojo.setFirstname(firstname);
        registerPojo.setLastname(lastname);
        registerPojo.setUsername(username);
        registerPojo.setPassword(password);
        registerPojo.setEmail(email);
   
        registerDao.addUser(registerPojo);
      break;
      case 2:
    	  System.out.println("enter username:");
    	  username = br.readLine();
    	  System.out.println("enter pass:");
    	  password = br.readLine();
    	  loginPojo.setUsername(username);
    	  loginPojo.setPassword(password);
    	  if(loginDao.validate(loginPojo)) {
    		  System.out.println("Successfully validated");
    	  }
    	  else
    		  System.out.println("Invaild");
    	  
      break;
      
      }
      
      
      
      
      
      
		
		
		
		
		
	}
}
