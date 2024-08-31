package phonebook;

import java.sql.*;



public class Main {

	public static void main(String[] args) throws SQLException {
		
		CreateTable table= new CreateTable();
		table.createTable1();
		
		Menu run= new Menu();
		run.runMenu();
		
	
		
	}}
	

