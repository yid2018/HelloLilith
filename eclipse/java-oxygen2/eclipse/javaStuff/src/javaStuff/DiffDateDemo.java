package javaStuff;

import java.util.*;


public class DiffDateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			long start=System.currentTimeMillis();
			System.out.println(new Date()+"\n");
			Thread.sleep(5*6*10);
			System.out.println(new Date()+"\n");
			long end=System.currentTimeMillis();
			long diff=end-start;
			System.out.println("Difference is : " + diff);
			
			
		}catch(Exception e) {
			System.out.println("Got an exception.");
			
		}

	}

}
