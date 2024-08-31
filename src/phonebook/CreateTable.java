package phonebook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {

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
	 
	
		public void createTable1() {
		 try {Connection conn = this.connect(); 
		      Statement stmt;
			 stmt = conn.createStatement();
			 String sql1= "CREATE TABLE contacts ( FirstName TEXT, LastName TEXT NOT NULL PRIMARY KEY , FixNumber LONG NOT NULL , MobileNumber LONG , MailAdress TEXT NOT NULL )";
			 stmt.executeUpdate(sql1);
			 System.out.println("Table created sucsesfully!\n");
			 stmt.close();
			 
		 }catch(Exception e) {System.out.println(e.getMessage());}
		 
	 }
}
