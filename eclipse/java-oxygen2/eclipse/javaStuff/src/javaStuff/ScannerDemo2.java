package javaStuff;

import java.util.Scanner;

public class ScannerDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("receive data by next method: ");
		
		//Get string via next()
		if(scan.hasNext()) {
			String str1=scan.next();
			System.out.println("Input data value is:" +str1);
		}
		scan.close();

	}

}
