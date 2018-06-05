import java.util.*;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[]= {"A","E","I"};
		String[] b= {"O","U"};
		
		List list=new ArrayList(Arrays.asList(a));
		list.addAll(Arrays.asList(b));
		Object[] c=list.toArray();
		System.out.println(Arrays.toString(c));
	}

}
