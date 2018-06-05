
public class StringComparePerformance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime=System.currentTimeMillis();
		for(int i=0;i<5000000;i++) {
			String s1="hellom";
			String s2="hellom";
		}
		
		long endTime=System.currentTimeMillis();
		System.out.println(startTime);
		System.out.println(endTime);
		System.out.println("通过String关键字创建字符串"+":"+(endTime-startTime)+"毫秒");
		
		long startTime1=System.currentTimeMillis();
		for(int i=0;i<5000000;i++) {
			String s3=new String("hellom");
			String s4=new String("hellom");
		}
		
		long endTime1=System.currentTimeMillis();
		System.out.println(startTime1);
		System.out.println(endTime1);
		System.out.println("通过String对象创建字符串"+":"+(endTime1-startTime1)+"毫秒");

	}

}
