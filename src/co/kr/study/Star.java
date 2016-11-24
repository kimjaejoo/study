package co.kr.study;

public class Star {
	public static void main(String[] a) {
		int line = 10;
		int star = 0;
		int space = line;

		for (int i = 0; i < line; i++) {
			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < star; j++) {
				System.out.print("*");
			}
			if (i < line - 1)
				System.out.println("");
			space--;
			star++;
		}

		System.out.println();

		// 100개의 공간이 있는 int형의 array를 생성하고 반복문을 이용하여 출력
		// 그럼 0부터 99 까지의 숫자가 출력됨
		/*
		 * int Int = 100; int[] myArray = new int[Int]; for (int i = 0; i <=
		 * Int; i++) { myArray[i] = i ; } for (int i = 0; i <= Int; i++) {
		 * System.out.println(myArray[i]); }
		 */

		// 1에서 100까지의 소수의 합을 구한다. 소수는 1과 자기 자신으로밖에 나누지 못하는 것
		// 예를들어 2,3,5,7
		// 약수는 4,6,8,9,10
		int count, sum = 0;
		for (int i = 2; i < 100; i++) {
			count = 0;
			for (int j = 2; j < i; j++) {
				if(i % j == 0){
					count ++;
					// 1과 정수 사이의 숫자중 하나라도 나눈나머지가 0일때는 소수가 아니다
				}
			}
			System.out.println(count);
			if(count == 0){
				// count가 올라갔다면 소수가 아니다.
				System.out.println(i + "소수입니다.");
				sum = sum + i;
				};
		}
		System.out.println(sum);
		int s = 2;
		for (int i = 3; i < 100; i++) {
			int c = 0;
			for (int j = 2; j < i; j++) {
				if(i % j == 0){
					c ++;
				}
			}
			if(c == 0){
				s = s + i;
				System.out.println(i);
				//System.out.println(s);
			};
		}
		
		String txtString = new String("wisenut");
		StringBuffer buffer = new StringBuffer("wisenut");
		StringReplace(txtString);
		bufferReplace(buffer);
		System.out.println(txtString + buffer);
		// String은 클래스를 넘어가면 초기화값으로 돌아가는 반면 Stringbuffer안에 값은 돌아가지않고
		// 문자열을 바뀐그대로를 저장하여 사용한다.
	}
	
	public static void StringReplace(String str){
		str = str.replace("w", "1");
		// replace는 지정한 문자열을 다른 지정한 문자열로 바꾸어준다
		System.out.println(str);
	}
	
	public static void bufferReplace(StringBuffer str){
		//str.setLength(0);
		str.append("add");
		//append는 buffer안에 들어있는 문자열의 뒤에 지정한 문자열을 붙인다? 넣는다??
		System.out.println(str);
	}
	
	
	

}
