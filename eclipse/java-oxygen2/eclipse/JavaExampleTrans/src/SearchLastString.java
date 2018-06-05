
public class SearchLastString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strOrig="Hello world , Hello Runnoob";
		int lastIndex=strOrig.lastIndexOf("Runnoob");
		System.out.println(strOrig.length());
		if(lastIndex==-1) {
			System.out.println("没有找到字符串"+" Runnoob");
		}else {
			System.out.println("Runnoob字符串最后出现的位置： "+lastIndex);
		}

	}

}
