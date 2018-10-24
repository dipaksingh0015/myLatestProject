package com.test.test;

public class Factorial {

	public static void main(String[] args) {
		int num = 6;
		int factorial = 1;
		for(int i = 1; i <= num; i++) {
//			factorial = factorial * i;
			factorial *= i;
		}
		System.out.println(factorial);

	}

}
