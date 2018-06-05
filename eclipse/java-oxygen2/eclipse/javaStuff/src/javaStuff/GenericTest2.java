package javaStuff;

import java.util.*;

public class GenericTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> name=new ArrayList<String>();
		List<Integer> age=new ArrayList<Integer>();
		List<Number> number=new ArrayList<Number>();
		
		name.add("icon");
		age.add(18);
		number.add(314);
		
		
		//getData(name);
		getData(age);
		getData(number);

	}

	private static void getData(List<? extends Number> data) {
		// TODO Auto-generated method stub
		System.out.println("data: "+data.get(0));
		
	}

}
