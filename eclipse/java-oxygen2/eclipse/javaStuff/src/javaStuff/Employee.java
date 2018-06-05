package javaStuff;

import java.io.*;


public class Employee {
	
	String name;
	int age;
	String designation;
	double salary;
	//class constructor

	public Employee(String name){
		this.name=name;		
	}
	
	//set age
	public void setAge(int empAge) {
		age = empAge;
	}
	
	public void setDesignation(String empDesig) {
		designation = empDesig;
	}
	
	public void setSalary(double empSalary) {
		salary = empSalary;
	}
	
	public void printEmployee() {
		System.out.println("name is: "+name);
		System.out.println("age is: "+age);
		System.out.println("designation is: "+designation);
		System.out.println("salary is: "+salary);
		
	}
}
