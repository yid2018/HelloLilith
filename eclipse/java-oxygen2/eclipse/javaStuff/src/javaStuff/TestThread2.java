package javaStuff;

class RunnableDemo implements Runnable{
	private Thread t;
	private String threadName;
	
	RunnableDemo(String name){
		threadName=name;
		System.out.println("Creating "+threadName);
	}
	
	public void run() {
		System.out.println("Runing "+threadName);
		try {
			for(int i=4;i>0;i--) {
				System.out.println("Thread "+threadName+", "+i);
				//run sleep() method
				Thread.sleep(50);
			}
		}catch(InterruptedException e){
			System.out.println("Thread "+threadName+" interrupped.");
			}
		System.out.println("Thread "+threadName+" exiting.");
	}
	
	public void start() {
		System.out.println("Starting "+threadName);
		if(t==null) {
			t=new Thread(this,threadName);
			t.start();
		}
	}
	
	
	
}

public class TestThread2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunnableDemo R1=new RunnableDemo("Thread-1");
		R1.start();
		
		RunnableDemo R2=new RunnableDemo("Thread-2");

	}

}
