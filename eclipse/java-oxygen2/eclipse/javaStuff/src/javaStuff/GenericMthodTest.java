package javaStuff;

public class GenericMthodTest {
	
	//Generic method printArray
	public static <E> void printArray(E[] inputArray) {
		// Output Array elements
		for(E element:inputArray) {
			System.out.printf("%s ",element);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] intArray= {1,2,3,4,5};
		Double[] doubleArray= {1.1,2.2,3.3,4.4};
		Character[] charArray= {'H','D','L','L','O'};
		
		System.out.println("Int Array element is: ");
		printArray(intArray);
		
		System.out.println("\nDouble Array element is: ");
		printArray(doubleArray);
		
		System.out.println("\nCharacter Array element is: ");
		printArray(charArray);
		

	}

}
