package sms;

import java.util.*;

public class Mai 
{
	public static void main(String args[]) {
		
		 System.out.println("Welcome to the Student management system");
		 System.out.println("--------------------------------------------------");
		 System.out.println("Login as: \n1)Teacher \n2)Student");
		 int a;
		 Scanner s=new Scanner(System.in);
		 a=s.nextInt();
		 if(a==1) {
			 System.out.println("Please enter the PIN to access these features");
			 int pin;
			 pin=s.nextInt();
			 if(pin==1801) {
				 
				 {
				 System.out.println("What do you want to do?\n1)Add A new student\n2)Get Details of a student via roll number\n3)Remove a student");
				 int i;
				 i=s.nextInt();
				 if(i==1) {
					 NewStuden p=new NewStuden();
						p.addvoter();
						
				 }
				 if(i==2) {
						GetDetail obj=new GetDetail();
						
						obj.fn();
						
				 }
				 if(i==3) {
		
						System.out.println("Enter the Rollnumber of the student you want to remove");
						int rn=s.nextInt();

						{
					 RemoveAStudent j=new RemoveAStudent();
					 j.rm(rn);
				 }
			 }
		 
			 else{
				 System.out.println("Wrong PIN entered");}
			 }}}
		 if(a==2) {
			 System.out.println("Hello Student");
			 GetDetail obj=new GetDetail();
				
				obj.fn();
				
		 }}}

