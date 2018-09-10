package test;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		System.out.println("Enter String: ");
		Scanner scan = new Scanner(System.in);
		String st = scan.nextLine();
		scan.close();
		for (int i = 0; i < st.length(); i++) {
			if (st.charAt(i) == 'a' || st.charAt(i) == 'e' || st.charAt(i) == 'i' || st.charAt(i) == 'o' ||st.charAt(i) == 'u'){
				if((i + 1) % 2 != 0) {
					System.out.print(st.charAt(i));
				}
			} else {
				System.out.print(st.charAt(i));
			}
		}

	}

}
