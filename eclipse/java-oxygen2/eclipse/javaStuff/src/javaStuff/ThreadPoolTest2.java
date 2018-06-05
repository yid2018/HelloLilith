package javaStuff;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Executor;

public class ThreadPoolTest2 {

	public ThreadPoolTest2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建线程池对象参数5，代表有5个线程的线程池
		ExecutorService service=Executors.newFixedThreadPool(3);
		//创建Runnable线程任务对象
		TaskCallable c=new TaskCallable();
		//从线程池中获取线程对象
		service.submit(c);
		System.out.println("--------------------------");
		//再获取一个线程对象
		service.submit(c);
		//关闭线程池
		service.shutdown();
		

	}

}
