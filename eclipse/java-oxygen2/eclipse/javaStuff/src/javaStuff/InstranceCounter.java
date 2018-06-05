package javaStuff;

public class InstranceCounter {
	
	private static int munInstances = 0;
	
	protected static int getCount() {
		return munInstances;
	}
	
	private static void addInstance() {
		munInstances++;
	}
	
	public InstranceCounter() {
		// TODO Auto-generated constructor stub
		InstranceCounter.addInstance();
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Starting with "+InstranceCounter.getCount()+" instances");
		for (int i=0; i<500; i++) {
			new InstranceCounter();
		}
		System.out.println("Created "+InstranceCounter.getCount()+" instances.");

	}

}
