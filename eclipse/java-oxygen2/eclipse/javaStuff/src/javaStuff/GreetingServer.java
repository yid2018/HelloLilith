package javaStuff;

import java.net.*;
import java.io.*;

public class GreetingServer extends Thread{
	
	private ServerSocket serverSocket;
	
	public GreetingServer(int port) throws IOException{
		serverSocket=new ServerSocket(port);
		serverSocket.setSoTimeout(10000);
	}
	
	public void run() {
		while(true) {
			try {
				System.out.println("waiting for remote connection, port: "+serverSocket.getLocalPort()+"...");
				Socket server=serverSocket.accept();
				
				System.out.println("Remote server address: "+server.getRemoteSocketAddress());
				DataInputStream in=new DataInputStream(server.getInputStream());
				System.out.println(in.readUTF());
				DataOutputStream out=new DataOutputStream(server.getOutputStream());
				
				out.writeUTF("Thanks for link me: "+server.getLocalSocketAddress()+"\nGoodbye!");
				server.close();	
				
				
			}catch(SocketTimeoutException s){
				System.out.println("Socket timed out!");
				break;
			}catch(IOException e) {
				e.printStackTrace();
				break;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int port=Integer.parseInt(args[0]);
		try {
			Thread t=new GreetingServer(port);
			t.run();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		

		

	}

}
