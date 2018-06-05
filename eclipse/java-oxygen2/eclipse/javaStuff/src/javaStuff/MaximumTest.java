package javaStuff;

public class MaximumTest {
	
	public static <T extends Comparable<T>> T maxinum(T x, T y, T z) {
		T max=x; //x is defined as initial max value
		if(y.compareTo(max)>0) {
			max=y;
		}
		
		if(z.compareTo(max)>0) {
			max=z;
		}
		
		return max;
		
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("the max value in %d,%d and %d is %d\n\n",3,4,5,maxinum(3,4,5));
			
		System.out.printf( "The max value of %.1f, %.1f and %.1f is %.1f\n\n",6.6, 8.8, 7.7, maxinum( 6.6, 8.8, 7.7 ) );
				
		System.out.printf("the max value in %s, %s and %s is %s\n\n","pear","apple","orange",maxinum("pear","apple","orange"));

	}

}
