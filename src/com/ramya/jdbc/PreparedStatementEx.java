package com.ramya.jdbc;
import java.sql.*;
public class PreparedStatementEx {

	public static void main(String[] args)throws SQLException {
		// TODO Auto-generated method stub
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");	
		}
		catch(ClassNotFoundException e) {}
	
		
		  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/crud_lab","root","root");
			
			
		  PreparedStatement pst = con.prepareStatement("insert into employees values(?,?,?,?,?)");
			pst.setInt(1, 101);
			pst.setString(2, "ramya");
			pst.setString(3,"dudikatla");
			pst.setInt(4,21);
			pst.setString(5, "sofrware developer");
			
			// optional
			
			int no_of_row_inserted = pst.executeUpdate();
			System.out.println("no_of_row_inserted : "+no_of_row_inserted);
			
			con.close();
	
		
		

	}


}
