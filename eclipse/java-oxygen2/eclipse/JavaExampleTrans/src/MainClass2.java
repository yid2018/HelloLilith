import java.util.*;

public class MainClass2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int array[]= {2, 5, -2, 6, -3, 8, 0, -7, -9, 4};
		Arrays.sort(array);
		printArray("数组排列结果为：",array);
		int index=Arrays.binarySearch(array, 2);
		System.out.println("元素 1 在第"+index+"个位置（负数为不存在）。");
		
		int newIndex=0;
		if(index<0) {
			newIndex=-index-1;
		}else {
			newIndex=index+1;
		}
		
		array=insertElement(array,1,newIndex);
		
		printArray("数组添加元素 1",array);
	}

	private static int[] insertElement(int[] original, int element, int newIndex) {
		// TODO Auto-generated method stub
		int length=original.length;
		int destination[]=new int[length+1];
		System.arraycopy(original, 0, destination, 0, newIndex);
		destination[newIndex]=element;
		System.arraycopy(original, newIndex, destination, newIndex, length-newIndex);
			
		return destination;
	}

	private static void printArray(String message, int[] array) {
		// TODO Auto-generated method stub
		System.out.println(message+"： [length: "+array.length+"]");
		for(int i=0;i<array.length;i++) {
			if(i !=0) {
				System.out.print(",");
			}
			System.out.print(array[i]);
		}
		System.out.println();
		
	}

}
