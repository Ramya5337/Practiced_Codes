package com.ramya.jdbc;
import java.sql.*;
public class DisplayEmployeeTable {

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
					//sql query to display entire table
					String select_query="select * from employees";
					
					Statement st=con.createStatement();
					ResultSet rs =st.executeQuery(select_query);
					//displaying the table
					while(rs.next())
					{
				
					System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4)+"\t"+rs.getString(5));
					}
					con.close();
					
				



	}

}
