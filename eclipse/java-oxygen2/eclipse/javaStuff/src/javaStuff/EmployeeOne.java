package javaStuff;


import java.io.*;

public class EmployeeOne {
	public String name;
	private double salary;

	public EmployeeOne(String empName) {
		// TODO Auto-generated constructor stub
		name = empName;
	}
	
	public void setSalary(double empSal) {
		salary=empSal;
	}
	
	
	public void printEmp() {
		System.out.println("name: "+name);
		System.out.println("Salary:" + salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeOne empOne =  new EmployeeOne("RUNOOB");
		empOne.setSalary(1000);
		empOne.printEmp();

	}

}
