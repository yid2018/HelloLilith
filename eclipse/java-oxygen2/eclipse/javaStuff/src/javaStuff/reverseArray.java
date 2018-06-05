package javaStuff;

public class reverseArray {
	
	public static int[] reverse(int[] list) {
		int[] result = new int[list.length];
		for (int i=0,j=list.length-1;i<list.length;i++,j--) {
			result[j]=list[i];
		}
	
	return result;
	}
	
	public static void main(String[] args) {
		
		reverseArray mola=new reverseArray();	
		
		int[] list= {11,22,3,99};
		
		int[] reverseResult=mola.reverse(list);
		
		for(int i=0;i<reverseResult.length;i++) {
			System.out.println(reverseResult[i]);
		}
	}
}

