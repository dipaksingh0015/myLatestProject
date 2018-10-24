package com.test.test;

public class Armstrong1 {

	public static void main(String[] args) {
		int num = 153;
		int a, c = 0;
		int temp = num;
		/*for(int i = 0; i < num;) {
			a = num % 10;
			num = num / 10;
			c = c + (a*a*a);
		}*/
		while(num > 0){
			a = num % 10;
			num = num / 10;
			c = c + (a*a*a);
		}
		if(temp == c) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("not Armstrong");
		}

	}

}
