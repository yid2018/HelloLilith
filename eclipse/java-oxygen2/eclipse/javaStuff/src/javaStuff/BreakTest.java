package javaStuff;

public class BreakTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers= {10,20,30,40,50};
		
		for (int x:numbers) {
			if(x==30) {
				break;
			}
			
			System.out.println(x);
		}

	}

}
