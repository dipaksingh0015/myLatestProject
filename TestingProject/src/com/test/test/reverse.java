package com.test.test;

public class reverse {
	
	public static void main(String[] args) {
		String reverse = "";
		String str = "test reverse";
//		int n = str.length();
		for(int i = str.length() -1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		System.out.println(reverse);

	}

}
