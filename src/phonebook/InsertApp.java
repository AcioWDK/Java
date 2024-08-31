package phonebook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertApp {

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
	 
	
	
	
 public void insert( String fn, String ln, Long fix, Long nr, String ml) {
	 
	 String sql="INSERT INTO contacts  (FirstName,LastName,FixNumber,MobileNumber,MailAdress) VALUES(?,?,?,?,?)";
	Connection conn = this.connect();
	 try {
		 
	
		PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,fn); 
			pstmt.setString(2, ln);
			pstmt.setLong(3, fix);
			pstmt.setLong(4, nr);
			pstmt.setString(5, ml);
			pstmt.executeUpdate();
			System.out.println("\nData saved successfully!");
			conn.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	 }
 }

