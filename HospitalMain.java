package com.bridgelabz.review;

public class HospitalMain {
    public static void main(String[] args) {
    	Patients p1 = new Patients();
    	Hospital h1 = new Hospital();
    
    	h1.addhospital("A","Karnataka","Neurology");
    	h1.addhospital("B","Kerala","ONCOLOGY");
    	
    	p1.add("Mohan","24","96122","Bangalore","Karnataka","Neurology");
    	
    	
    	
    }
}
