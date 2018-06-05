package javaStuff;

public class Logger {
	
	private String format;
	public String getFormat() {
		return this.format;
	}
	
	public void setFormat(String eo) {
		format =eo;
	}

	public Logger() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger log = new Logger();
		log.setFormat("luna");
		System.out.println(log.getFormat());
		//this.format = format;

	}

}
