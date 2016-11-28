package co.kr.study.sort;

public class BubbleSort {

	public static void main(String[] args) {
		// 버블정렬
		/* 인접한 두개의 값을 비교하여 자리를 바꾸어준다
		 * 9개의 공간이 존재하는 배열안에 무작위의 데이터가 존재한다.
		 * 버블 정렬은 0번째의 데이터와 1번째의 데이터를 비교하여 1번째의 값이 더 작다면 자리를 변경한다.
		 * 첫번째 for문은 9개의 공간의 범위를 설정한다.
		 * 두번째 for문은 우리가 원하는 정렬에 들어가는 핵심적인 부분이 된다
		 * 해석하게 되면 9개의 무작위 데이터가 존대한다. 첫번째 for문으로 9개의 무작위 데이터를 뽑아준다 
		 * => 두번째 for문을 생성하고 범위는 배열의 길이만큼익고 하나씩 늘어난다.
		 * => 만약에 0번째의 값과  그 다음값인 0+1번째의 값을 비교하여 0번째의 값이 더 크다면 자리를 변경한다.
		 * => 두개의 for문으로 정렬하고 다음 for문을 생성하여 정렬된 데이터를 뽑아준다. 
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
	
	// 이거 왜 안돼??
	public static void swap(int a, int b){
		int temp = a ;
		a = b ;
		b = temp ;
	}

}
