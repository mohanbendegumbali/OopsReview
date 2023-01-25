package com.bridgelabz.review;

public class Hospital {
   String Hname;
   String Hlocation;
   String Hdepartment;
   
   void addhospital(String Hname, String Hlocation, String Hdepartment) {
	   this.Hname=Hname;
	   this.Hlocation=Hlocation;
	   this.Hdepartment=Hdepartment;
	   
	   System.out.println("Hospital Name: " +Hname);
	   System.out.println("Hospital Location: " +Hlocation);
	   System.out.println("Hospital Department: " +Hdepartment);
	   
	   
   
   }
}
