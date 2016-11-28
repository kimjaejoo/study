package co.kr.study.sort;

import java.util.Arrays;

public class Sort {

	static int temp;
	
	// public static을 사용함으로서 이 클래스 안에서 공용으로 사용할수 있게 해준다. 따라서 따로 instance화 하지 않아도 데이터를 함수를 사용가능해진다.

	public static void bubbleSort(int a[]) {
		int size = a.length;

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size - 1; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}
	// 서로 이웃한 데이터의 크기를 비교하고 값의 자리를 변경한다.
	// i의 반복문으로 전체 데이터의 값을 뽑아주며 
	// j의 반복문으로 값을 비교한다. j는 왼쪽 j+1은 오른쪽의 데이터를 나타낸다.

	public static void selectSort(int a[]) {

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}

	public static void insertionSort(int a[]) {
		int j = 0;
		for (int i = 1; i < a.length; i++) {
			temp = a[i];
			for (j = i - 1; j >= 0 && temp < a[j]; j--) {
				a[j + 1] = a[j];
			}
			a[j + 1] = temp;
		}
	}

	public static void main(String[] args) {
		int a[] = { 9, 1, 8, 2, 7, 3, 6, 4, 5 };
		bubbleSort(a);
		int b[] = { 10, 23, 576, 43, 5, 769, 90, 2 };
		for (int i = 0; i < a.length; i++) {
			System.out.println("bubbleSort : " + a[i]);
		}
		selectSort(b);
		for (int i = 0; i < b.length; i++) {
			System.out.println("selectSort : " + b[i]);
		}
		insertionSort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println("insertionSort : " + a[i]);
		}
			
		// 자바에는 기본적으로 정렬에대한 정보를 제공한다.
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));
	}

}
