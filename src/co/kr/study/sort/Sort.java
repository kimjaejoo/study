package co.kr.study.sort;

import java.util.Arrays;

public class Sort {

	static int temp;
	
	// public static�� ��������μ� �� Ŭ���� �ȿ��� �������� ����Ҽ� �ְ� ���ش�. ���� ���� instanceȭ ���� �ʾƵ� �����͸� �Լ��� ��밡��������.

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
	// ���� �̿��� �������� ũ�⸦ ���ϰ� ���� �ڸ��� �����Ѵ�.
	// i�� �ݺ������� ��ü �������� ���� �̾��ָ� 
	// j�� �ݺ������� ���� ���Ѵ�. j�� ���� j+1�� �������� �����͸� ��Ÿ����.

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
			
		// �ڹٿ��� �⺻������ ���Ŀ����� ������ �����Ѵ�.
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));
	}

}
