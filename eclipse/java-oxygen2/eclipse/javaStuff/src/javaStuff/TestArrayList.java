package javaStuff;

import java.util.*;

public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		list.add("Hello");
		list.add("World");
		list.add("HAHAHAHA");
		
		//Cover ArrayList via foreach method
		for(String str:list) {
			System.out.println(str);
		}
		
		//Cover via linked_List_Trans_Array method
		String[] strArray=new String[list.size()];
		list.toArray(strArray);
		for(int i=0;i<strArray.length;i++) {
			System.out.println(strArray[i]);
		}
		
		//Cover via Iterator method
		Iterator<String> ite=list.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}

	}

}
