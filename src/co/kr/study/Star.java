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

		// 100���� ������ �ִ� int���� array�� �����ϰ� �ݺ����� �̿��Ͽ� ���
		// �׷� 0���� 99 ������ ���ڰ� ��µ�
		/*
		 * int Int = 100; int[] myArray = new int[Int]; for (int i = 0; i <=
		 * Int; i++) { myArray[i] = i ; } for (int i = 0; i <= Int; i++) {
		 * System.out.println(myArray[i]); }
		 */

		// 1���� 100������ �Ҽ��� ���� ���Ѵ�. �Ҽ��� 1�� �ڱ� �ڽ����ιۿ� ������ ���ϴ� ��
		// ������� 2,3,5,7
		// ����� 4,6,8,9,10
		int count, sum = 0;
		for (int i = 2; i < 100; i++) {
			count = 0;
			for (int j = 2; j < i; j++) {
				if(i % j == 0){
					count ++;
					// 1�� ���� ������ ������ �ϳ��� ������������ 0�϶��� �Ҽ��� �ƴϴ�
				}
			}
			System.out.println(count);
			if(count == 0){
				// count�� �ö󰬴ٸ� �Ҽ��� �ƴϴ�.
				System.out.println(i + "�Ҽ��Դϴ�.");
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
		// String�� Ŭ������ �Ѿ�� �ʱ�ȭ������ ���ư��� �ݸ� Stringbuffer�ȿ� ���� ���ư����ʰ�
		// ���ڿ��� �ٲ�״�θ� �����Ͽ� ����Ѵ�.
	}
	
	public static void StringReplace(String str){
		str = str.replace("w", "1");
		// replace�� ������ ���ڿ��� �ٸ� ������ ���ڿ��� �ٲپ��ش�
		System.out.println(str);
	}
	
	public static void bufferReplace(StringBuffer str){
		//str.setLength(0);
		str.append("add");
		//append�� buffer�ȿ� ����ִ� ���ڿ��� �ڿ� ������ ���ڿ��� ���δ�? �ִ´�??
		System.out.println(str);
	}
	
	
	

}
