package co.kr.study.sort;

public class SelectSort {
	public static void main(String[] args) {
		// ��������
		/*
		 * ���������� ù��Ʈ���� ���� ū ���ڴ� ���� �������� ���ְ� �ȴ�. 
		 * 
		 * 
		 */
		
		int[] sort = {9,1,8,2,7,3,6,4,5}; // 9���� ������ ���� �迭�� �����Ѵ�
		
		for (int i = 0; i < sort.length -1; i++) {
			for (int j = i + 1; j < sort.length; j++) {
				if(sort[i] > sort[j]){
					swap(sort[i], sort[j]);
				}
			}
		}
		for (int i = 0; i < sort.length; i++) {
			System.out.println(sort[i]);
		}
	}
	
	public static void swap(int a , int b){
		int temp;
		temp = a;
		a = b;
		b = temp;
	}
}
