package co.kr.study;

public class BaeYul {
	public static void main(String[] args) {
		/*int myInt = 100;
		int[] myArray = new int[myInt];
		for (int i = 0; i <= myInt; i++) {
			myArray[i] = i;
		}
		for (int i = 0; i <= myInt; i++) {
			System.out.println(myArray[i]);
		}
		*/
		BaeYul baeYul = new BaeYul();
		int a = baeYul.main(1);
		String b = baeYul.main("¼ýÀÚ1");
		System.out.println(a +" / "+ b);
	}
	
	public int main(int a){
		//System.out.println(a);
		return a;
	}
	
	public String main(String b){
		//System.out.println(b);
		return b;
	}
}
