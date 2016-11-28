package co.kr.study.sort;

public class BubbleSort {

	public static void main(String[] args) {
		// ��������
		/* ������ �ΰ��� ���� ���Ͽ� �ڸ��� �ٲپ��ش�
		 * 9���� ������ �����ϴ� �迭�ȿ� �������� �����Ͱ� �����Ѵ�.
		 * ���� ������ 0��°�� �����Ϳ� 1��°�� �����͸� ���Ͽ� 1��°�� ���� �� �۴ٸ� �ڸ��� �����Ѵ�.
		 * ù��° for���� 9���� ������ ������ �����Ѵ�.
		 * �ι�° for���� �츮�� ���ϴ� ���Ŀ� ���� �ٽ����� �κ��� �ȴ�
		 * �ؼ��ϰ� �Ǹ� 9���� ������ �����Ͱ� �����Ѵ�. ù��° for������ 9���� ������ �����͸� �̾��ش� 
		 * => �ι�° for���� �����ϰ� ������ �迭�� ���̸�ŭ�Ͱ� �ϳ��� �þ��.
		 * => ���࿡ 0��°�� ����  �� �������� 0+1��°�� ���� ���Ͽ� 0��°�� ���� �� ũ�ٸ� �ڸ��� �����Ѵ�.
		 * => �ΰ��� for������ �����ϰ� ���� for���� �����Ͽ� ���ĵ� �����͸� �̾��ش�. 
		 */
		
		int[] sort = { 9, 1, 8, 2, 7, 3, 6, 4, 5 };

		int temp = 0;

		for (int i = 0; i < sort.length; i++) {
			for (int j = 0; j < sort.length - 1; j++) {
				// System.out.println(sort[i]);
				if (sort[j] > sort[j + 1]) {
					temp = sort[j];
					sort[j] = sort[j + 1];
					sort[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < sort.length; i++) {
			System.out.println(sort[i]);
		}
	}
	
	// �̰� �� �ȵ�??
	public static void swap(int a, int b){
		int temp = a ;
		a = b ;
		b = temp ;
	}

}
