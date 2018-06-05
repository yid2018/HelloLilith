package javaStuff;

import java.io.*;


public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee empOne = new Employee("RUNOB1");
		Employee empTwo = new Employee("RUNOB2");
		
		//use the methods of the upper 2 objects
		empOne.setAge(26);
		empOne.setDesignation("Senior DEV");
		empOne.setSalary(1500.22);
		empOne.printEmployee();
		
		empTwo.setAge(21);
		empTwo.setDesignation("Junior DEV");
		empTwo.setSalary(1000.00);
		empTwo.printEmployee();

	}

}
