package test;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		/*String s1 = "abc";
		String s2 = "abc";
		System.out.println("s1 == s2 is:" + (s1 == s2 ? true : false));
*/
		/*
		 * String s3 = "JournalDev";
		 * 
		 * int start = 1; char end = 5; System.out.println(start + end);
		 * System.out.println(s3.substring(start, end));
		 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter number: ");
		int num = scan.nextInt();
		scan.close();
		
		int fact =1;
		for(int i = 1; i <= num; i++)
			fact = fact*i;
		System.out.println(fact);
	}

}

