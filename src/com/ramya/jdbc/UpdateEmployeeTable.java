package com.ramya.jdbc;
import java.sql.*;
public class UpdateEmployeeTable {

	public static void main(String[] args) throws Exception {
		// using try catch to handle class not found exception
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			}
			catch(ClassNotFoundException e) {}
			String url="jdbc:mysql://localhost:3306/crud_lab";
			String username="root";
			String pwd="root";
			
			Connection con=DriverManager.getConnection(url,username,pwd);
			//alter to add designation column to employees
			String alter_query="alter table employees add Designation varchar(50)";
			Statement st=con.createStatement();
			//executing alter query
			st.executeUpdate(alter_query);
			System.out.println("designation column added successfully");
			//update query to do updates
			String update_query="update employees set age=25,Designation='software developer' where id=101";
			//executing update query
			st.executeUpdate(update_query);
			System.out.println("record updated successfully");
			
			con.close();

	}

}
