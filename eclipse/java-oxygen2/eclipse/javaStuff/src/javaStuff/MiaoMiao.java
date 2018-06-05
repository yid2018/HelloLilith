package javaStuff;

public class MiaoMiao implements Animal {
	public void eat() {
		System.out.println("Miaomiao eat.");
	}
	
	public void travel() {
		System.out.println("Miaomiao travel.");
	}
	
	public int noOfLegs() {
		return 0;
	}
	
	public static void main(String[] args) {
		MiaoMiao m=new MiaoMiao();
		m.eat();
		m.travel();
		System.out.println(m.noOfLegs());
	}

}
