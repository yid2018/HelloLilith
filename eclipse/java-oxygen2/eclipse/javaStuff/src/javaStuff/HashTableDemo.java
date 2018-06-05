package javaStuff;

import java.util.*;

public class HashTableDemo {

	public static void main(String[] args) {
		// create a hash map
		Hashtable balance=new Hashtable();
		Enumeration names;
		String str;
		double bal;
		
		balance.put("Zara", new Double(3434.34));
		balance.put("Karjo", new Double(123.22));
		balance.put("Luna", new Double(1378.01));
		balance.put("Zmei", new Double(99.22));
		balance.put("Qadir", new Double(-19.08));
		
		//show all balance in hash table
		names=balance.keys();
		while(names.hasMoreElements()) {
			str=(String)names.nextElement();
			System.out.println(str+": "+balance.get(str));
		}
		
		System.out.println("Zara's new balance: "+balance.get("Zara"));
		

	}

}
