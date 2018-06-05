package javaStuff;

import java.io.*;

public class fileStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int[] bWrite= {22,21,11,2,5};

			OutputStream os=new FileOutputStream("hello.txt");
			for(int i=0;i<bWrite.length;i++) {
				os.write(bWrite[i]); //writes the bytes
			}
			os.close();	
			
			InputStream is=new FileInputStream("hello.txt");
			int size=is.available();
			
			for(int i=0;i<size;i++) {
				System.out.print((char)is.read()+" ");
			}
			is.close();			
			
			
		}catch(IOException e) {
			
			System.out.println("Exception");
			
		}

	}

}


