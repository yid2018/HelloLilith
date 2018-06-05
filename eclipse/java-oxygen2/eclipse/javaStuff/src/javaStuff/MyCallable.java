package javaStuff;

import java.util.concurrent.*;

public class MyCallable implements Callable<Integer>{
	//成员变量
	int x=5;
	int y=3;
	
	public MyCallable() {
	}
	
	public MyCallable(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	@Override
	public Integer call() throws Exception{
		return x+y;
	}

}
