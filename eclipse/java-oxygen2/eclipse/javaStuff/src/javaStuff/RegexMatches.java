package javaStuff;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegexMatches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String line="This order was placed for QT3000! OK?";
		String pattern="(\\D*)(\\d+)(.*)";
		
		//create Pattern object
		Pattern r=Pattern.compile(pattern);
		
		//create Match object
		Matcher m=r.matcher(line);
		if (m.find()) {
			System.out.println("Found values: "+m.group(0));
			System.out.println("Found values: "+m.group(1));
			System.out.println("Found values: "+m.group(2));
			System.out.println("Found values: "+m.group(3));
			
		}
		else {
			System.out.println("No MATCH");
		}
		
		

	}

}
