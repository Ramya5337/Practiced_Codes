package com.ramya.jdbc;
import java.sql.*;
public class CreateUsingPst {

	public static void main(String[] args) throws SQLException{
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	
			}
			catch(ClassNotFoundException e) {}
		
			
			  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/crud_lab","root","root");
			  PreparedStatement pst=con.prepareStatement("create table customer(id int primary key,name varchar(20),address varchar(20));");
			  pst.executeUpdate();
			  
			  con.close();
			  

	}

}
