
public class StringConcatenate2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime=System.currentTimeMillis();
		for(int i=0;i<5000;i++) {
			String result="This is"+"testing the "+"differrnce "+"between "+"String "+"and "+"StringBuffer";
			
		}
		long endTime=System.currentTimeMillis();
		System.out.println("字符串连接 "+" - 使用+操作符： "+(endTime-startTime)+" ms.");
		
		long startTime1=System.currentTimeMillis();
		for(int i=0;i<5000;i++) {
			StringBuffer result=new StringBuffer();
			result.append("This is ");
			result.append("testing the ");
			result.append("difference ");
			result.append("between ");
			result.append("String ");
			result.append("and ");
			result.append("StringBuffer. ");
		}
		
		long endTime1=System.currentTimeMillis();
		System.out.println("字符串连接 "+" - 使用StringBuffer： "+(endTime1-startTime1)+" ms.");
	}

}
