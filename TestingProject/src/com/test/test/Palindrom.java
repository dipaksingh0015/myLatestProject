package com.test.test;

public class Palindrom {

	public static void main(String[] args) {
		
		/*String s = "549";
		int n = s.length();
		String reverse = "";
		for(int i = n-1; i >=0; i--) {
			reverse = reverse + s.charAt(i);
		}
		if(reverse.equals(s)) {
			System.out.println("palindrom");
		}
		else {
			System.out.println("not palindrom");
		}*/
		int r, sum = 0;
		int n = 546;
		int temp = n;
		while(n > 0) {
			r = n % 10;
			sum = (sum*10)+r;
			n = n / 10;
		}
		if(temp == sum) {
			System.out.println("palindrom");
		}
		else {
			System.out.println("not palindrom");
		}

	}

}
