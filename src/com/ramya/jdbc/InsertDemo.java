package com.ramya.jdbc;
import java.sql.*;
public class InsertDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(ClassNotFoundException e) {}
		String url="jdbc:mysql://localhost:3306/product_info";
		String username="root";
		String pwd="root";
		Connection con=DriverManager.getConnection(url,username,pwd);
		String insert_query="insert into products values(01,'notebooks',50)";
		Statement st=con.createStatement();
		st.executeUpdate(insert_query);
		System.out.println("record inserted successfully");
		
		

	}

}
