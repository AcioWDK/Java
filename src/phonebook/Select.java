package phonebook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Select {

	public  Connection connect() {
		 Connection conn = null;
		 try {
			 Class.forName("org.sqlite.JDBC");
			 conn = DriverManager.getConnection("jdbc:sqlite:contacts.db");
		 }catch(Exception e ) {
			 System.out.println(e.getMessage());
		 }
		 return conn;
	 }
	
	public void selectAll() {
		String sql= "SELECT * FROM contacts";
				try (Connection conn = this.connect();
			             Statement stmt  = conn.createStatement();
			             ResultSet rs    = stmt.executeQuery(sql)){
			            
			            while (rs.next()) {
			                System.out.println(rs.getString("FirstName") +  "\t" + 
			                                   rs.getString("LastName") + "\t" +
			                                   rs.getInt("FixNumber") +  "\t" + 
			                                   rs.getInt("MobileNumber") +  "\t" + 
			                                   rs.getString("MailAdress"));
			            }conn.close();
			        } catch (SQLException e) {
			            System.out.println(e.getMessage());
			        
			   
	}
	}
}
