package javaStuff;

public class StringBufferTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sBuffer=new StringBuilder("cainiao class home page: ");
		sBuffer.append("www.");
		sBuffer.append("runoob");
		sBuffer.append("com");
		//sBuffer.reverse();
		sBuffer.delete(2, 9);
		sBuffer.insert(11, "66");
		
		System.out.println(sBuffer);

	}

}
