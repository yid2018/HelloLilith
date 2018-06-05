package javaStuff;

public class StringFormatDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float floatVar=3.05f;
		int intVar=28;
		String StringVar="What's up.";
		
		String fs;
		fs=String.format("float value is "+"%f, integer valus is "+"%d, String value is "+"%s", floatVar,intVar, StringVar);
		System.out.println(fs);

	}

}
