
public class JavaStringSplitEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="www-louuuna-com";
		String[] temp;
		String delimeter="-";
		temp=str.split(delimeter);
		for(int i=0;i<temp.length;i++) {
			System.out.println(temp[i]);
			
		}
		
		
		System.out.println(str.replace("-", "."));
		
		
		System.out.println("using foreach cycle method");
		String str1="www.rainbow.com";
		String[] temp1;
		String delimeter1="\\.";
		
		temp1=str1.split(delimeter1);
		for(String x:temp1) {
			System.out.println(x);
			
		}

	}

}
