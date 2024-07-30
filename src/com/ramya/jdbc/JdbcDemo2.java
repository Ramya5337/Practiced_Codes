package com.ramya.jdbc;
import java.sql.*;
public class JdbcDemo2{
	public static void main(String args[]) throws Exception{
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(ClassNotFoundException e) {}
		String sql_query="create table products(product_id int,produc_name varchar(10),products_avail int)";
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/product_info","root","root");
		Statement st = con.createStatement();
		st.executeUpdate(sql_query);
		System.out.println("Table created successfully");

		st.close();

		
	}

}
