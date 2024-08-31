package phonebook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {

	public Connection connect() {
		Connection conn = null;
		try {
			Class.forName("org.sqlite.JDBC");
			conn = DriverManager.getConnection("jdbc:sqlite:contacts.db");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return conn;
	}

	public void delete1(String fn, String ln) {
		String sql = "DELETE FROM contacts WHERE FirstName = ? AND LastName= ?";
		try (Connection conn = this.connect(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setString(1, fn);
			pstmt.setString(2, ln);
			pstmt.executeUpdate();
			conn.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
}
