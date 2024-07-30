package com.ramya.jdbc;
import java.sql.*;
public class CreateEmployee {

	public static void main(String[] args) throws Exception {
		//using try catch to handle class not found exception
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			}
			catch(ClassNotFoundException e) {}
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/crud_lab","root","root");
		//query to create employee table
		String create_query="create table employees(id int primary key auto_increment,first_name varchar(50),last_name varchar(50),age int)";
		Statement st=con.createStatement();
		//executing query
		st.executeUpdate(create_query);
		
		System.out.println("employee table created successfully");
		con.close();

	}

}
