package javaStuff;

public class TestArrayForEach {

	public static void main(String[] args) {
		// total block
		int total=0;
		double[] myList= {1.9,1.8,3.4,99};
		
		for(int i=0;i<myList.length;i++) {
			total+=myList[i];
		}
		System.out.println(total);
		
		
		//Max block
		double max=0;
		for (int i=0; i<myList.length;i++) {
			if(myList[i]>max) {
				max=myList[i];
			}
				
		}
		System.out.println("The max value is "+max);	
		
		//print all the element in the myList array
				for (int j=0; j<myList.length; j++) {
					System.out.println(myList[j]+"|");
		}

	}

}
