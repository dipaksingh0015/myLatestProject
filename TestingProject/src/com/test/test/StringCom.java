package com.test.test;

import java.util.Scanner;

public class StringCom {

	public static void main(String[] args) {
		String str1new = "";
		String str2new = "";
		
		Scanner scan = new Scanner(System.in);
		System.out.print("str1: ");
		String str1 = scan.nextLine();
		System.out.print("str2: ");
		String str2 = scan.nextLine();
		scan.close();
		int str1len = str1.length();
		int str2len = str2.length();
		
		
		for(int i = 0; i < str1len; i++) {
			char ch1 = str1.charAt(i);
			boolean b = false;
			for(int j = 0; j < str2len; j++) {
				char ch2 = str2.charAt(j);
				if(ch1 == ch2) {
//					b = true;
//					break;
					System.out.println("op1: null");
					break;
				}
				else{
					str1new += ch1;
					System.out.println("op2: "+str1new);
				}
			}
			/*if(!b) {
				str1new += ch1;
				System.out.println(str1new);
//				str2new += ch2;
			}*/
		}
		/*for(int i = 0; i < str1len; i++) {
			char ch2 = str2.charAt(i);
			boolean b = false;
			for(int j = 0; j < str2len; j++) {
				char ch1 = str1.charAt(j);
				if(ch2 == ch1) {
//					b = true;
//					break;
					System.out.println("null");
				}
			}
			if(!b) {
				str2new += ch2;
				System.out.println(str2new);
	
	}
  }*/
 }
}
		
