package javaStuff;

import java.net.*;
import java.io.*;

public class GreetingClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String serverName=args[0];
		int port=Integer.parseInt(args[1]);
		try {
			
			System.out.println("Link to host: "+serverName+", port: "+port);
			Socket client=new Socket(serverName,port);
			System.out.println("Remote server address: "+client.getRemoteSocketAddress());
			
			OutputStream outToServer=client.getOutputStream();
			DataOutputStream out=new DataOutputStream(outToServer);
			
			out.writeUTF("Hello from "+client.getLocalSocketAddress());
			InputStream inFromServer=client.getInputStream();
			DataInputStream in=new DataInputStream(inFromServer);
			System.out.println("Server response: "+in.readUTF());
			client.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
