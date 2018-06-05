
public class SearchStringEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strOrig="Google Runnoob Taobao";
		int intIndex=strOrig.indexOf("Runnoob");
		if(intIndex==-1) {
			System.out.println("Runoob is NOT found.");
		}else {
			System.out.println("Runoob's location is: "+intIndex);
		}

	}

}
