package javaStuff;

import java.io.*;

public class DescrializeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee4 e=null;
		try {
			FileInputStream fileIn=new FileInputStream("C:\\lu\\empoyee.ser");
			ObjectInputStream in=new ObjectInputStream(fileIn);
			e=(Employee4)in.readObject();
			in.close();
			fileIn.close();		
			
		}catch(IOException i) {
			i.printStackTrace();
			return;
		}catch(ClassNotFoundException c) {
			System.out.println("Empolyee class not found");
			c.printStackTrace();
			return;
		}
		
		System.out.println("Deserialized Employee...");
		System.out.println("Name: "+e.name);
		System.out.println("Address: "+e.address);
		System.out.println("SSN: "+e.SSN);
		System.out.println("Number: "+e.number);

	}

}
