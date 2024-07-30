package com.ramya.jdbc;
import java.sql.*;
public class Deleting {

	public static void main(String[] args) throws SQLException{
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	
			}
			catch(ClassNotFoundException e) {}
		
			
			  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/crud_lab","root","root");
			  String sql_query="delete from employees where id=?";
			  PreparedStatement pst=con.prepareStatement(sql_query);
			  
			  pst.setInt(1, 106);
			  
			  pst.executeUpdate();
			  con.close();

	}

}
