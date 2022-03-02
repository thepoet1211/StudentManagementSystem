package sms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.*;
public class RemoveAStudent {
	void rm(int rn){
	{

	
	try {

		Connection con = DriverManager.getConnection("Jdbc:mysql:///vote", "root", "P@rth$00d");
		Statement stmt = con.createStatement();
		String query = "DELETE FROM voterdetails WHERE RN="+rn+"";
		int i = stmt.executeUpdate(query);
System.out.println("Removed succesfully");
	} catch (Exception e) {
		System.out.println("Exception has occurred " + e);
	}
	

}}}
