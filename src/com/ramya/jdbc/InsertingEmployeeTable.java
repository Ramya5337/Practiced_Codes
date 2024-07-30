package com.ramya.jdbc;
import java.sql.*;
public class InsertingEmployeeTable  {

	public static void main(String[] args) throws Exception{
		
		//using try catch to handle class not found exception
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					}
					catch(ClassNotFoundException e) {}
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/crud_lab","root","root");
				//sql query to insert record into employee table
				String insert_query="insert into employees values(101,'John','Doe',30)";
				Statement st=con.createStatement();
				//to know the number of records inserted
				int countOfInsertedRows=st.executeUpdate(insert_query);
				System.out.println("record inserted successfully");
				System.out.println("No of records inseted : "+countOfInsertedRows);
				
				con.close();

	}

}
