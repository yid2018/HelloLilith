package javaStuff;

import java.util.Scanner;

public class ScannerDemoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("When all the values typed, please input \"end\"");
		Scanner scan=new Scanner(System.in);
		
		double sum=0;
		int m=0;
		
		while(scan.hasNextDouble()) {
		
		double x=scan.nextDouble();
		m=m+1;
		sum=sum+x;
		
		}
		//System.out.println("When all the values typed, please input \"end\"");
		System.out.println("The sum is:"+sum );
		System.out.println("The average value is: "+(sum/m));
	}
}
