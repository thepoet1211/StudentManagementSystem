package sms;

import java.sql.*;
import java.util.*;

public class NewStuden {

	void addvoter() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		{
			String name;
			int age;
			int rollnumber;
			Scanner s = new Scanner(System.in);
			System.out.println("Enter Your Name");
			name = s.nextLine();
			System.out.println("Enter The Roll number you want to alott");
			rollnumber = s.nextInt();
			System.out.println("Enter The Age");
			age = s.nextInt();

			try {

				Connection con = DriverManager.getConnection("Jdbc:mysql:///vote", "root", "P@rth$00d");
				Statement stmt = con.createStatement();
				String query = "insert into voterdetails (Name,RN,Age) values ('" + name + "'," + rollnumber + "," + age + ");";

				int i = stmt.executeUpdate(query);
				if (i > 0) {
					System.out.println(name + " " + age + " " + rollnumber + " Record inserted");
				} else {
					System.out.println("Error");
				}
			} catch (Exception e) {
				System.out.println("Exception has occurred " + e);
			}
			s.close();
		}
	}
}
