package javaStuff;

import java.util.Calendar;
import java.util.*;

public class GregorianCanlendarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] months= {
				"Jan","Feb","Mar","Apr",
				"May","Jun","Jul","Aug",
				"Sep","Oct","Nov","Dec"
		};
		
		int year;
		
		GregorianCalendar gcalendar=new GregorianCalendar();
		System.out.print("Date:");
		System.out.print(months[gcalendar.get(Calendar.MONTH)]+"");
		System.out.print(" "+gcalendar.get(Calendar.DATE)+" ");
		System.out.print(" "+gcalendar.get(Calendar.YEAR));
		System.out.println();
		System.out.print("Time: ");
		System.out.print(gcalendar.get(Calendar.HOUR)+": ");
		System.out.print(" "+gcalendar.get(Calendar.MINUTE)+": ");
		System.out.print(" "+gcalendar.get(Calendar.SECOND));
		System.out.println();
		
		//
		year=gcalendar.get(Calendar.YEAR);
		if(gcalendar.isLeapYear(year)) {
			System.out.println("This year is LEAP year");
			}
		else {
			System.out.println("This year is not LEAP year");
		}
		
		

	}

}
