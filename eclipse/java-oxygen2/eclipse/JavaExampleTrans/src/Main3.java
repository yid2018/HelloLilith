import java.util.Arrays;
import java.util.Collections;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] numbers= {8,2,7,1,4,9,5};
		Arrays.sort(numbers);
		int min=Collections.max(Arrays.asList(numbers));
		int max=Collections.min(Arrays.asList(numbers));
		
		//System.out.println(numbers);
		System.out.println("The max value is:"+max);
		System.out.println("The min value is:"+min);

	}

}
