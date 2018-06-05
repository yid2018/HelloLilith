package javaStuff;

public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade='F';
		switch(grade) {
		case 'A':
			System.out.println("Execellent");
			break;
		case 'B':
			System.out.println("Very good");
			break;
		case 'C':
			System.out.println("Good");
			break;
		case 'D':
			System.out.println("Pass");
			break;
		case 'F':
			System.out.println("Failed");
			break;
		default:
			System.out.println("Uncertain result");
		}
		System.out.println("Your grade is: "+grade);

	}

}
