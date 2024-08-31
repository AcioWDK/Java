package phonebook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Modify {

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
	 public void modify1(String who, String ln, int fr)
	 {
		 
		  if(fr ==1) {
		  String SQL_UPDATE = "UPDATE contacts SET FirstName=? WHERE LastName=?";

		        try (Connection conn = this.connect();
		             PreparedStatement preparedStatement = conn.prepareStatement(SQL_UPDATE)) {
		        	
		        	preparedStatement.setString(1,ln);
		        	preparedStatement.setString(2, who);
		            
		           

		            int row = preparedStatement.executeUpdate();

		            if(row!=0)
			            System.out.println("\nData modified successfully! in row: "+ row);
			            else System.out.println("\nData not modified. Please try again!");
		            conn.close();
		        } catch (SQLException e) {
		            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
		 
	 }
	 
	 if(fr ==2) {
		  String SQL_UPDATE = "UPDATE contacts SET LastName=? WHERE LastName=?";

		        try (Connection conn = this.connect();
		             PreparedStatement preparedStatement = conn.prepareStatement(SQL_UPDATE)) {
		        	
		        	preparedStatement.setString(2, who);
		            preparedStatement.setString(1,ln);
		           

		            int row = preparedStatement.executeUpdate();

		            if(row!=0)
			            System.out.println("\nData modified successfully! in row: "+ row);
			            else System.out.println("\nData not modified. Please try again!");
		            conn.close();
		        } catch (SQLException e) {
		            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
		 
	 }
	 

if(fr ==3) {
	  String SQL_UPDATE = "UPDATE contacts SET FixNumber=? WHERE LastName=?";

	        try (Connection conn = this.connect();
	             PreparedStatement preparedStatement = conn.prepareStatement(SQL_UPDATE)) {
	        	
	        	preparedStatement.setString(2, who);
	            preparedStatement.setString(1,ln);
	           

	            int row = preparedStatement.executeUpdate();
	            if(row!=0)
		            System.out.println("\nData modified successfully! in row: "+ row);
		            else System.out.println("\nData not modified. Please try again!");
	            conn.close();
	        } catch (SQLException e) {
	            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	 
}


if(fr ==4) {
	  String SQL_UPDATE = "UPDATE contacts SET MobileNumber=? WHERE LastName=?";

	        try (Connection conn = this.connect();
	             PreparedStatement preparedStatement = conn.prepareStatement(SQL_UPDATE)) {
	        	
	        	preparedStatement.setString(2, who);
	            preparedStatement.setString(1,ln);
	           

	            int row = preparedStatement.executeUpdate();

	            if(row!=0)
		            System.out.println("\nData modified successfully! in row: "+ row);
		            else System.out.println("\nData not modified. Please try again!");
	            conn.close();
	        } catch (SQLException e) {
	            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	 
}


if(fr ==5) {
	  String SQL_UPDATE = "UPDATE contacts SET MailAdress=? WHERE LastName=?";

	        try (Connection conn = this.connect();
	             PreparedStatement preparedStatement = conn.prepareStatement(SQL_UPDATE)) {
	        	
	        	preparedStatement.setString(2, who);
	            preparedStatement.setString(1,ln);
	           

	            int row = preparedStatement.executeUpdate();

	            if(row!=0)
		            System.out.println("\nData modified successfully! in row: "+ row);
		            else System.out.println("\nData not modified. Please try again!");
	            conn.close();
	        } catch (SQLException e) {
	            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	 
}}


}
