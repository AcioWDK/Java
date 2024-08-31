package phonebook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Search {

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

	public void select1(int wt, String who) {
		Statement st;
		ResultSet rs;
		if (wt == 1)
			try {
				Connection conn = this.connect();
				st = conn.createStatement();
				String searchQuery = "SELECT	* FROM contacts WHERE FirstName LIKE '%" + who + "%' ";
				rs = st.executeQuery(searchQuery);

				while (rs.next()) {
					System.out.println(
							rs.getString("FirstName") + "\t" + rs.getString("LastName") + "\t" + rs.getInt("FixNumber")
									+ "\t" + rs.getInt("MobileNumber") + "\t" + rs.getString("MailAdress"));
				}
				conn.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}

		if (wt == 2)
			try {
				Connection conn = this.connect();
				st = conn.createStatement();
				String searchQuery = "SELECT	* FROM contacts WHERE LastName LIKE '%" + who + "%' ";
				rs = st.executeQuery(searchQuery);

				while (rs.next()) {
					System.out.println(
							rs.getString("FirstName") + "\t" + rs.getString("LastName") + "\t" + rs.getInt("FixNumber")
									+ "\t" + rs.getInt("MobileNumber") + "\t" + rs.getString("MailAdress"));
				}
				conn.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}

		if (wt == 3)
			try {
				Connection conn = this.connect();
				st = conn.createStatement();
				String searchQuery = "SELECT	* FROM contacts WHERE FixNumber LIKE '%" + who + "%' ";
				rs = st.executeQuery(searchQuery);

				while (rs.next()) {
					System.out.println(
							rs.getString("FirstName") + "\t" + rs.getString("LastName") + "\t" + rs.getInt("FixNumber")
									+ "\t" + rs.getInt("MobileNumber") + "\t" + rs.getString("MailAdress"));
				}
				conn.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}

		if (wt == 4)
			try {
				Connection conn = this.connect();
				st = conn.createStatement();
				String searchQuery = "SELECT	* FROM contacts WHERE MobileNumber LIKE '%" + who + "%' ";
				rs = st.executeQuery(searchQuery);

				while (rs.next()) {
					System.out.println(
							rs.getString("FirstName") + "\t" + rs.getString("LastName") + "\t" + rs.getInt("FixNumber")
									+ "\t" + rs.getInt("MobileNumber") + "\t" + rs.getString("MailAdress"));
				}
				conn.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}

		if (wt == 5)
			try {
				Connection conn = this.connect();
				st = conn.createStatement();
				String searchQuery = "SELECT	* FROM contacts WHERE MailAdress LIKE '%" + who + "%' ";
				rs = st.executeQuery(searchQuery);

				while (rs.next()) {
					System.out.println(
							rs.getString("FirstName") + "\t" + rs.getString("LastName") + "\t" + rs.getInt("FixNumber")
									+ "\t" + rs.getInt("MobileNumber") + "\t" + rs.getString("MailAdress"));
				}

			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}

	}
}
