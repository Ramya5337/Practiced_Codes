package com.ramya.jdbc;
import java.sql.*;
public class UpdateUsingPst {
	public static void main(String args[])throws SQLException {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	
			}
			catch(ClassNotFoundException e) {}
		
			
			  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/crud_lab","root","root");
			  String sql_query="update employees set first_name='sowmya' where id=101";
			  PreparedStatement pst=con.prepareStatement(sql_query);
			  pst.executeUpdate();
			  System.out.println("record updated successfully");
			  con.close();
	}

}
