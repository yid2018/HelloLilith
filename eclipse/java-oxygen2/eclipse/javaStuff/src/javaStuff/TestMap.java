package javaStuff;

import java.util.*;

public class TestMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> map=new HashMap<String,String>();
		map.put("1", "value1");
		map.put("2", "value2");
		map.put("3", "value3");
		
		
		// 1st method: normal method
		System.out.println("Via Map.keySet cover key and value: ");
		for(String key:map.keySet()) {
			System.out.println("key= "+key+" and value= "+map.get(key));
			//System.out.println();
		}
		System.out.println();
		
		//second method: use iterator cover key and value with Map.entrySet method
		System.out.println("use iterator cover key and value with Map.entrySet method");
		Iterator<Map.Entry<String, String>> it=map.entrySet().iterator();
		
		while(it.hasNext()) {
			Map.Entry<String, String> entry=it.next();
			System.out.println("key= "+entry.getKey()+" and value="+entry.getValue());
			//System.out.println();
			
		}
		System.out.println();
		
		//3rd method: suggested, of huge capability
		System.out.println("Cover key and value with Map.entrySet");
		for(Map.Entry<String, String> entry: map.entrySet()) {
			System.out.println("key= "+entry.getKey()+" and value= "+entry.getValue());
		}
		System.out.println();
		
		//4th method
		System.out.println("Cover value NOT key with Map.values method");
		for(String v:map.values()) {
			System.out.println("value= "+v);
		//	System.out.println();
		}
		

	}

}
