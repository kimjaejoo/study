package co.kr.study.sort;

public class SelectSort {
	public static void main(String[] args) {
		// 선택정렬
		/*
		 * 선택정렬의 첫루트에서 제일 큰 숫자는 제일 마지막에 가있게 된다. 
		 * 
		 * 
		 */
		
		int[] sort = {9,1,8,2,7,3,6,4,5}; // 9개의 공간을 갖는 배열을 생성한다
		
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
