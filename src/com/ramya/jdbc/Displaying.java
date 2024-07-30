package com.ramya.jdbc;
import java.sql.*;
public class Displaying {

	public static void main(String[] args) throws SQLException{
		// TODO Auto-generated method stub

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	
			}
			catch(ClassNotFoundException e) {}
		
			
			  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/crud_lab","root","root");
			  
			  String sql_query="select id,age from employees where first_name like ?";
			  
			  PreparedStatement pst=con.prepareStatement(sql_query);
			  pst.setString(1, "%a");
			  ResultSet rs=pst.executeQuery();
			  while(rs.next()) {
			  System.out.println(rs.getInt(1)+"\t"+rs.getInt(2));
			  }
	}

}
