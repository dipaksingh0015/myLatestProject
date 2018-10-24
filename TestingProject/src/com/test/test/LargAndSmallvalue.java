package com.test.test;

//import java.lang.reflect.Array;
//import java.util.Arrays;

public class LargAndSmallvalue {
	public static int getLargest(int[] a) {
//		Arrays.sort(a);
//		return a[a.length-1];
		int largeNum = a[0];
		for(int i = 0; i < a.length-1; i++) {
			if(a[i] > largeNum) {
				largeNum = a[i];
			}
		}return largeNum;
		
	}
	
	public static int getSmallest(int[] a) {
		int smallNum = a[0];
		for(int i = 0; i < a.length -1; i++) {
			if(a[i] < smallNum) {
				smallNum = a[i];
			}
		}return smallNum;
	}

	public static void main(String[] args) {
		int a[] = {2, 10, 4, 84, 13, 37, 5, 50, 1, 34};
//		int b[] = {23, 23, 12, 3, 2, 45, 33, 14, 5};
		System.out.println("Largest number is: "+getLargest(a));
		System.out.println("Smallest number is: "+getSmallest(a));
		

	}

}
