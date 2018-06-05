package javaStuff;

public class BoxGenTest<T> {
	
	private T t;
	
	public void add(T t) {
		this.t=t;
	}
	
	public T get() {
		return t;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoxGenTest<Integer> integerBox=new BoxGenTest<Integer>();
		BoxGenTest<String> stringBox=new BoxGenTest<String>();
		
		integerBox.add(new Integer(10));
		stringBox.add(new String("Junior Guide"));
		
		System.out.printf("Integer value is %d.\n\n",integerBox.get());
		System.out.printf("String value is %s. \n\n",stringBox.get());
	}

}
