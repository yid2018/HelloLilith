package javaStuff;

import java.io.*;

public class DeleteFileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File folder=new File("C:\\javaFilelab");
		deleteFolder(folder);

	}
	
	public static void deleteFolder(File folder) {
		File[] files=folder.listFiles();
		if(files!=null) {
			for(File f:files) {
				if(f.isDirectory()) {
					deleteFolder(f);
				}else {
					f.delete();
				}
				
			}
		}
		folder.delete();
	}

}
