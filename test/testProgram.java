package test;

//import java.util.Scanner;

public class testProgram {

	public static void main(String[] args) {
		
//		program for pattern
		
 /*for(int x = 1; x <= 5; x++) {
 for(int y =1; y <= x; y++) {
	 System.out.print(y+ "");
 }
 
 System.out.println();
 }
	}
}
*/
// prime number
		/*Scanner scanner = new Scanner(System.in);
		int i = 0, num =0;
		String primeNumber = "";
		System.out.println("Enter the value of n:");
		int n = scanner.nextInt();
		scanner.close();
		for(i = 1; i <= n; i++) {
			int counter = 0;
			for(num = i; num >= 1; num--) {
				if(i%num == 0) {
					counter = counter+1;
					}
				if(counter==2) {
					
				}
				primeNumber = primeNumber + i + "";
			}
			
		}
			System.out.println("prime number of 1 to n are:");
			System.out.println(primeNumber);
			
		*/
		
//		fibonacci series
		
		int a=0, b=1, c, i, count=10;
		
		System.out.println(a+ "" +b);
		for(i=2; i<=count; i++) {
			c= a+b;
			System.out.println("" +c);
			a=b;
			b=c;
			
			
		}
		
	}
}