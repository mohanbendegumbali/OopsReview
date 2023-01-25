package com.bridgelabz.review;
import java.util.*;

public class Patients {
	String name;
	String age;
	String phoneNumber;
	String city;
	String state;
	String department;

void add(String name, String age, String phoneNumber, String city, String state, String department) {
	this.name=name;
	this.age=age;
	this.phoneNumber=phoneNumber;
	this.city=city;
	this.state=state;
	this.department=department;
	
	System.out.println(" Patient Name: " +name);
	System.out.println(" Patient Age: " +age);
	System.out.println(" Patient PhoneNumber: " +phoneNumber);
	System.out.println(" Patient City: " +city);
	System.out.println(" Patient State: " +state);
	System.out.println(" Patient Department: " +department);
	
}



enum department{
	ONCOLOGY,
	NEUROLOGY,
	CARDIOLOGY,
	GYNOCOLOGY
}
}

