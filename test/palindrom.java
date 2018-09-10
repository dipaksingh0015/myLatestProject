package test;

import java.util.Scanner;

public class palindrom {

	public static void main(String[] args) {
		String num, reverse = "";
		Scanner scan = new Scanner(System.in);
//		int number = scan.nextInt();
	    System.out.println("Please enter your number: ");
		num = scan.nextLine();
		scan.close();
		int length = num.length();
		for(int i = length - 1; i >=0; i--)
			reverse = reverse + num.charAt(i);
		if(num.equals(reverse)) {
			System.out.println("Number is pelindrom");
		}
		else {
			System.out.println("Number is not pelindrom");
		}
		

	}

}
