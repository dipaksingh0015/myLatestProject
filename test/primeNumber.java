package test;

import java.util.Scanner;

public class primeNumber {
	
      public static void main(String[] args) {
		/*int num = 21, count;
		
		for(int i=1; i<=num; i++) {
			count = 0;
			for(int j=2; j<=i/2; j++) {
				
				if(i%j == 0) {
					count++;
					break;
				}
			}
		     if(count == 0) {
		    	 System.out.println(i);
		   
		    	
		     }
		}*/
		
//    	  int num = 17;
    	  Scanner scan = new Scanner(System.in);
    	  System.out.print("Please enter number: ");
    	  int num = scan.nextInt();
    	  scan.close();
    	  int counter = 0;
    	  for(int i=2; i <= (num / 2); i++) {
    		  if(num % i == 0) {
    			  counter++;
    			  break;
    		  }
    	  }
    	  System.out.println((counter > 0) ? "Not Prime" : "Prime");
	}

}
