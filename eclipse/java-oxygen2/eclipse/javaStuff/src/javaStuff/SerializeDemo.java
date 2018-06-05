package javaStuff;

import java.io.*;

public class SerializeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee4 e=new Employee4();
		e.name="Reyan Ali";
		e.address="Phokka Kuan, Ambehta Peer";
		e.SSN=11122333;
		e.number=101;
		
		try {
			FileOutputStream fileOut=new FileOutputStream("C:\\lu\\empoyee.ser");
			ObjectOutputStream out=new ObjectOutputStream(fileOut);
			out.writeObject(e);
			out.close();
			System.out.println("Serialized data is saved in C:\\lu\\empoyee.ser");
			
		}catch(IOException i) {
			i.printStackTrace();
			
		}

	}

}
