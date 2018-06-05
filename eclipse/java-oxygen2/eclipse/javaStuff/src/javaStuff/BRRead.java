package javaStuff;

import java.io.*;

public class BRRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		char c;
		
		//use System.in create BufferedReader
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input characters, click 'q' key to exit:");
		
		//read characters
		do {
			c=(char)br.read();
			System.out.println(c);
		
		}while(c!='q');
	}

}

