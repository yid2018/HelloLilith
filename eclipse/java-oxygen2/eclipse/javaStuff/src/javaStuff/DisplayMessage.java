//Create thread via implements Runnable interface

package javaStuff;

public class DisplayMessage implements Runnable {
	
	private String message;

	public DisplayMessage(String messsage) {
		// TODO Auto-generated constructor stub
		this.message=message;
	}
	
	public void run() {
		while(true) {
			System.out.println(message);
		}
	}

}
