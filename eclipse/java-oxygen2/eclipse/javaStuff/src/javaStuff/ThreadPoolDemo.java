package javaStuff;

import java.util.concurrent.*;

public class ThreadPoolDemo {

	public static void main(String[] args) throws InterruptedException,ExecutionException {
		// TODO Auto-generated method stub
		//创建线程池对象
		ExecutorService threadPool=Executors.newFixedThreadPool(2);
		
		//创建一个Callable接口子类对象
		//MyCallable c=new MyCallable();
		MyCallable c=new MyCallable(100,200);
		MyCallable c2=new MyCallable(10,20);
		
		//获取线程池中的线程，调用Callable接口子类对象中call()的方法，完成求和操作
		//<Integer> Funter<Integer> submit(Callable<Integer> task)
		//Future 结果对象
		
		Future<Integer> result=threadPool.submit(c);
		//此Future的get方法所返回的结果类型
		Integer sum=result.get();
		System.out.println("sum="+sum);
		
		//再演示
		result=threadPool.submit(c2);
		sum=result.get();
		System.out.println("sum="+sum);
		
		//关闭线程池;
				
		

	}

}
