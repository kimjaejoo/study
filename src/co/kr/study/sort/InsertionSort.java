package co.kr.study.sort;

import java.util.Random;

public class InsertionSort {
	

	
	public void insertionSort(int a[]){
		int size = a.length;
		int temp;
		int j = 0;
		for (int i = 1; i < a.length; i++) {
			temp = a[i];
			for ( j = i - 1; j >= 0 && temp < a[j]; j--) {
				a[j+1] = a[j];
			}
			a[j+1] = temp;
		}
	}
	
	public static void main(String[] args) {
		// »ðÀÔÁ¤·Ä
		InsertionSort sort = new InsertionSort();
		
		int a [] = {9,1,8,2,7,3,6,4,5};
 		
		sort.insertionSort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println("insertionSort : " + a[i]);
		}
	}
}