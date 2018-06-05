
public class StringReverseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string="mola dalalaN";
		String reverse=new StringBuffer(string).reverse().toString();
		
		System.out.println("字符串反转前："+string);
		System.out.println("字符串反转后："+reverse);

	}

}
