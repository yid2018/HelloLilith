
public class StringRegionMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String first_str="Welcome to Microsoft";
		String second_str="I work with microsoft";
		
		boolean match=first_str.regionMatches(11, second_str, 12, 9);
		boolean match2=first_str.regionMatches(true,11, second_str, 12, 9);
		
		System.out.println("区分大小写返回值： "+match);
		System.out.println("不区分大小写返回值： "+match2);

	}

}
