package com.test.test;

public class BubbleSort {
	public static void bubbleSort(int []arr) {
		int n = arr.length;
		int temp = 0, i;
		for( i = 0; i < n; i++) {
			for(int j = 1; j <= (n-1); j++) {
				if(arr[j-1] > arr[j]) {
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
					
				}
			}
		}
	}

	public static void main(String[] args) {
		int []arr = {14, 45, 54, 4, 7, 8, 0};
//		int arr[] = {3, 5, 10, 6, 33, 24, 25, 38, 27, 2};
		System.out.println("Before");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ ",");
		}
		System.out.println();
		bubbleSort(arr);
		
		System.out.println("After");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ ",");
		}
		
		

	}

}
