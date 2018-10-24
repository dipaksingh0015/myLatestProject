package com.test.test;

import java.util.Arrays;

public class AnagramTest {
	
	public static boolean checkEquality() {
		char[] s1 = {'K', 'e', 'e', 'p'};
		char[] s2 = {'P', 'e', 'e', 'k'};
		boolean flag = true;
		if(s1.length == s2.length) {
			Arrays.sort(s1);
			Arrays.sort(s2);
			Arrays.equals(s1,s2);
			
		}else {
			flag = false;
			
		}
		
		return flag;
		
	}

	public static void main(String[] args) {
		
		boolean b =  checkEquality();
		if(b) {
			System.out.println("it's anagram");
		}else {
			System.out.println("It's not anagram");
		}
		
		

	}

}
