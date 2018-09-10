package test;

import java.util.Arrays;

public class ArraysExample {
	public static int getLargest(int[] a) {
		Arrays.sort(a);
		return a[a.length - 1];
	}
	
	public static int getsmallest(int[] a) {
		int smallNum = a[0];
		for(int i = 1; i< a.length - 1; i++  ) {
			if(a[i] < smallNum) {
				smallNum = a[i]; 
			}
		}
		return smallNum;
	}

	public static void main(String[] args) {
		int a[] = { 2, 4, 6, 8, 10, 12 };
		int b[] = { 33, 22, 11, 44, 55, 66, 77 };
		System.out.println("Large number:" + getLargest(a));
		System.out.println("Smallest number:" + getsmallest(b));
	}
}
