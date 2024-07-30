package com.ramya.jdbc;
import java.sql.*;
public class DeletingRecords {

	public static void main(String[] args) throws Exception{
		// using try catch to handle class not found exception
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			}
			catch(ClassNotFoundException e) {}
			String url="jdbc:mysql://localhost:3306/crud_lab";
			String username="root";
			String pwd="root";
			
			Connection con=DriverManager.getConnection(url,username,pwd);
			//delete query to delete all records
			String delete_query="delete from employees";
			Statement st=con.createStatement();
			//counting number of records deleted
			int deleteCount=st.executeUpdate(delete_query);
			System.out.println("records deleted successfully");
			System.out.println("number of record deleted:"+deleteCount);
			
			con.close();

	}

}
