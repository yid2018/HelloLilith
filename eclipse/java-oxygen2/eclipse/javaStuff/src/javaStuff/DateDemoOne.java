package javaStuff;

import java.util.*;
import java.text.*;

public class DateDemoOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date=new Date();
		SimpleDateFormat ft=new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
		System.out.println(ft.format(date));

	}

}
