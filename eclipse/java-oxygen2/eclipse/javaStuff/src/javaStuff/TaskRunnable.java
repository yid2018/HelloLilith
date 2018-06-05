package javaStuff;

public class TaskRunnable implements Runnable {
	@Override
	
	public void run() {
		for(int i=0;i<20;i++) {
			System.out.println("自定义任务再执行"+i);
		}
	}

}
