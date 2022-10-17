package com.xworkz.core_java.inheritance;

public class HasARelationship {
	public static void main(String[] args) {
		Libary sharada = new Libary();
		sharada.name = "Sharada";
		sharada.noOfBooks = 100;
		sharada.location = "Bengaluru";
		
		sharada.student = new Student();
		System.out.println("Libary name :"+sharada.name);
		System.out.println("Student name : "+sharada.student.name);
		System.out.println("Student id :"+sharada.student.id);
		System.out.println("Student college :"+sharada.student.college);
		
	}

}
