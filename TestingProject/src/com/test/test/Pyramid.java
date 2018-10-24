package com.test.test;

public class Pyramid {

	public static void main(String[] args) {
		int number = 9;
		for (int i = 0; i < number; i++) {
			int ind = i;
			while(ind != 0) {
				System.out.print(" ");
				ind-=2;
			}
			int num = number;
			while(i < num) {
				System.out.print("*");
				num--;
			}
			System.out.println(" ");
			i++;
		}

	}

}
