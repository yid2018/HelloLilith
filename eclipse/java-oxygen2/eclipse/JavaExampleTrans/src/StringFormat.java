import java.util.Locale;

public class StringFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double e=Math.E;
		System.out.format("%f%n", e);
		System.out.format(Locale.CHINA,"%-10.4f%n%n",e);

	}

}
