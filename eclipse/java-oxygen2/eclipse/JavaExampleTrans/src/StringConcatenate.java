
public class StringConcatenate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime=System.currentTimeMillis();
		String[] strArr=new String[500];
		for(int i=0;i<500;i++) {
			String result="This is";
			strArr[i]=String.valueOf(result.hashCode());
			
		}
		long endTime=System.currentTimeMillis();
		System.out.println("字符串连接 "+" - 使用+操作符： "+(endTime-startTime)+" ms.");
		System.out.println(strArr[0]+"\n"+strArr[1]+"\n"+strArr[2]);
		
		long startTime1=System.currentTimeMillis();
		for(int i=0;i<500;i++) {
			StringBuffer result=new StringBuffer();
			result.append("This is ");
			strArr[i]=String.valueOf(result.hashCode());
		}
		
		long endTime1=System.currentTimeMillis();
		System.out.println("字符串连接 "+" - 使用StringBuffer： "+(endTime1-startTime1)+" ms.");
		System.out.println(strArr[0]+"\n"+strArr[1]+"\n"+strArr[2]);
	}

}
