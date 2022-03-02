package sms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
public class GetDetail {
	void fn(){
	{int rn;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the roll number");
	rn=s.nextInt();
	try
	 {
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 Connection con =DriverManager.getConnection("Jdbc:mysql:///vote","root","P@rth$00d");
	 Statement stmt = con.createStatement();
	 String query = "select * from voterdetails where RN="+rn+"";
	 ResultSet rs = stmt.executeQuery(query);
	 if(rs.next()) {
	 while(rs.next())
	{
	 System.out.println("RollNumber=="+rs.getInt("RN")+"----Name--"+rs.getString("Name")+"--------------age------------"+rs.getInt("Age"));
	}
	 }
	else {
		System.out.println("Record Does not exist");
	}}
	 catch(Exception e)
	 {
	System.out.println("Exception has occured "+e);
	 }
}}}

