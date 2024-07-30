package com.ramya.jdbc;
import java .sql.*;
import java.util.Scanner;
public class InsertingByExplicitly {

	public static void main(String[] args) throws SQLException{
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	
			}
			catch(ClassNotFoundException e) {}
		
			
			  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/crud_lab","root","root");
			  Scanner sc=new Scanner(System.in);
			  while(true) {
				  System.out.println("enter id");
				  int id=sc.nextInt();
				  System.out.println("enter first name");
				  String first_name=sc.next();
				  System.out.println("enter last name");
				  String last_name=sc.next();
				  System.out.println("enter age");
				  int age=sc.nextInt();
				  System.out.println("enter Designation");
				  String Designation=sc.next();
				  
				  
				  String insert_data = "insert into employees(id,first_name,last_name,age,designation) values (?,?,?,?,?)";
				  PreparedStatement pst=con.prepareStatement(insert_data);
				  pst.setInt(1, id);
				  pst.setString(2,first_name);
				  pst.setString(3,last_name);
				  pst.setInt(4, age);
				  pst.setString(5,	Designation);
				  int count=pst.executeUpdate();
				  System.out.println("no of records inserted"+count);
				  System.out.println("record inserted successfully");
				  System.out.println("do you want to inser again: yes/no");
				  String opinion=sc.nextLine();
				  
				  if(opinion.equalsIgnoreCase("no")) {
					  System.out.println("exit");
					  break;
				  }


			  }
			  con.close();
				
	}

}
