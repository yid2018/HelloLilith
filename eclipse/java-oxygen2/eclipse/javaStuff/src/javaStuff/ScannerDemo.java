package javaStuff;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("receive data by next method: ");
		
		//Get string via *nextline()*
		if(scan.hasNextLine()) {
			String str2=scan.nextLine();
			System.out.println("Input data value is:" +str2);
		}
		scan.close();

	}

}
