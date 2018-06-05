package javaStuff;

public class ContinueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers= {20,30,40,50,60,90,100};
		for(int x:numbers) {
			if (x==30 ||x==60) {
				continue;
			}
			System.out.println(x);
		}

	}

}
