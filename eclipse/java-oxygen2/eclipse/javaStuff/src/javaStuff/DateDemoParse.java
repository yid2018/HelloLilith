package javaStuff;
import java.util.*;
import java.text.*;

public class DateDemoParse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat ft=new SimpleDateFormat("yyyy-MM-dd");
		
		String input=args.length==0?"1818-11-11":args[0];
		
		System.out.print(input+" Parse as ");
		
		Date t;
		try {
			t=ft.parse(input);
			System.out.print(t);
		}catch(ParseException e) {
			System.out.println("Unparseable using" + ft);
		}

	}

}
