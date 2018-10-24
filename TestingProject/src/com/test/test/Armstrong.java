package com.test.test;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		int temp, a, c = 0;
		System.out.println("Enter your number: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
		
		temp = num;
		for(int i = 0; i < num;) {
			a = num % 10;
			num = num / 10;
			c = c + (a * a * a);
		}
		if(temp == c) {
			System.out.println("Entered number is Armstrong");
		}else {
			System.out.println("Entered number is not Armstrong");
		}
      
	}

}
