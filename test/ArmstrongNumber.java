package test;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int a, c=0, temp;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the numer: ");
		int num = scan.nextInt();
		scan.close();
		temp =num;
		/*while(num > 0) {
			a = num%10;
			num = num/10;
			c = c+(a*a*a);
		}*/
		for (int i = 0; i < num;) {
			a = num % 10;
			num = num / 10;
			c = c + (a * a * a);

		}
		if(temp == c) {
			System.out.println("Number is Armstrong!");
		}else {
			System.out.println("Number is not Armstrong!");
		}
		

	}

}
