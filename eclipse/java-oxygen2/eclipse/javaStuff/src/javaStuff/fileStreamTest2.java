package javaStuff;

import java.io.*;

public class fileStreamTest2 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File f=new File("hello.txt");
		
		//create FileOutputStream object
		FileOutputStream fop=new FileOutputStream(f);
		
		OutputStreamWriter writer=new OutputStreamWriter(fop,"UTF-8");
		
		writer.append("Input via Chinese");
		writer.append("\r\n");
		writer.append("English");
		writer.close();
		fop.close();
		
		//Create FileInputStream object
		FileInputStream fip=new FileInputStream(f);
		
		//Create InputStreamReader object
		InputStreamReader reader=new InputStreamReader(fip,"UTF-8");
		
		StringBuffer sb=new StringBuffer();
		while(reader.ready()) {
			sb.append((char)reader.read());
			}
		System.out.println(sb.toString());
		reader.close();
		
		fip.close();
		
		

	}

}
