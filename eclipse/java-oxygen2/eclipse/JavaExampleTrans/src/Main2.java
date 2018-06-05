import java.util.ArrayList;
//import java.util.*;
import java.util.Collections;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrayList=new ArrayList<String>();
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		arrayList.add("D");
		arrayList.add("E");
		System.out.println("反转前排序： "+arrayList);
		Collections.reverse(arrayList);
		System.out.println("反转后排序： "+arrayList);

	}

}
